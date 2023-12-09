package hn.unah.reposicion.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Posiciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "codigoEquipo")
    private Equipos equipo;

    @Column(name = "empates")
    private Integer empates;

    @Column(name = "ganados")
    private Integer ganados;

    @Column(name = "perdidos")
    private Integer perdidos;

    @Column(name = "golesFavor")
    private Integer golesFavor;

    @Column(name = "golesContra")
    private Integer golesContra;

    @Column(name = "puntos")
    private Integer puntos;

    


}
