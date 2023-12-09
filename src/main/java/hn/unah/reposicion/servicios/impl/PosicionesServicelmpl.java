package hn.unah.reposicion.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.reposicion.modelos.Posiciones;
import hn.unah.reposicion.repositorios.PosicionesRepository;
import hn.unah.reposicion.servicios.PosicionesService;

public class PosicionesServicelmpl implements PosicionesService {

    @Autowired
    private PosicionesRepository posicionesRepository;

    @Override
    public List<Posiciones> obtenerPosiciones() {
        return this.posicionesRepository.findAll();
    }
    
}
