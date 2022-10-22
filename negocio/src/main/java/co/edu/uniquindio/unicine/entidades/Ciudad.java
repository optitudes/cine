package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Ciudad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCiudad;
    private String nombre;

    @OneToMany(mappedBy="ciudad")
    private List<Cliente> clientes;
//relacion teatro-ciudad
    @OneToMany(mappedBy = "ciudad")
    private List<Teatro> teatros;

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }
}
