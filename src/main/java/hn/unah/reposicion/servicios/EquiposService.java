package hn.unah.reposicion.servicios;

import hn.unah.reposicion.modelos.Equipos;

public interface EquiposService {

    public Equipos crearEquipos(Equipos nvEquipos);

    public String eliminarEquiposPorCodigo (Integer numeroEquipos);

    public String buscarEquipoPorCodigo(Integer codigoEquipo, Equipos equipos);

    


    
}
