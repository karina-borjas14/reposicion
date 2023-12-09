package hn.unah.reposicion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.reposicion.modelos.Equipos;
import hn.unah.reposicion.servicios.EquiposService;
import hn.unah.reposicion.servicios.impl.EquiposServiceImpl;

@RestController
@RequestMapping("api/equipos")
public class EquiposController {
    
    @Autowired
    private EquiposServiceImpl equiposServiceImpl;

    public Equipos crearEquipos( @RequestBody Equipos nvEquipos){
        return this.equiposServiceImpl.crearEquipos(nvEquipos);

    }

    @DeleteMapping("/eliminar")
    public String eliminarEquiposPorCodigo (@RequestParam(name = "codigoEquipo") Integer codigoEquipo){
        return this.equiposServiceImpl.eliminarEquiposPorCodigo(codigoEquipo);
                                 
    }

    @GetMapping("/buscar/equipo/codigo")
    public ResponseEntity<String> buscarEquipoPorCodigo(@PathVariable Integer codigoEquipo) {
        String nombre = equiposServiceImpl.buscarEquipoPorCodigo(codigoEquipo, null);

        if (nombre != null) {
            return ResponseEntity.ok(nombre);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe quipo con el código: " + codigoEquipo);
        }
    }
  
    
    
    
    
    



    
}
