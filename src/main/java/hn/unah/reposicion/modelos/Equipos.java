package hn.unah.reposicion.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "equipos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Equipos {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoEquipo")
    private int codigoEquipo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ataque")
    private Double ataque;

    @Column(name = "defensa")
    private Double defensa;

    @OneToOne(mappedBy = "equipos", cascade = CascadeType.ALL )
    private List<Posiciones> posiciones;

    
}
