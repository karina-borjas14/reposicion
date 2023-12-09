package hn.unah.reposicion.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.reposicion.modelos.Equipos;
import hn.unah.reposicion.repositorios.EquiposRepository;
import hn.unah.reposicion.servicios.EquiposService;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquiposRepository equiposRepository;

    @Override
    public Equipos crearEquipos(Equipos nvEquipos) {
       return equiposRepository.save(nvEquipos);
    }

    @Override
    public String eliminarEquiposPorCodigo(Integer codigoEquipo) {
        Equipos ctEquipos  = this.equiposRepository.findById(codigoEquipo).get();
        if (ctEquipos != null){
            this.equiposRepository.delete(ctEquipos);
            return "Se ha eliminado el Artista " + ctEquipos.getCodigoEquipo();
        }

        return "No existe el artista con ese codigo" + codigoEquipo;
        
    
    }

    @Override
    public String buscarEquipoPorCodigo(Integer codigoEquipo, Equipos equipos) {
        Equipos cttEquipos = this.equiposRepository.findById(codigoEquipo).orElse(null);
        if (cttEquipos != null){
            return cttEquipos.getNombre(); 
        }else{
            return "No existe equipo con ese codigo " + codigoEquipo;
        }
    }

    
}
