package hn.unah.reposicion.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.reposicion.modelos.Posiciones;
import hn.unah.reposicion.servicios.impl.PosicionesServicelmpl;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionesController {

    @Autowired
    private PosicionesServicelmpl posicionesServicelmpl;

    @GetMapping("/obtener")
    public List <Posiciones>obtenerPosiciones(){
        return this.posicionesServicelmpl.obtenerPosiciones();
    }
    
}
