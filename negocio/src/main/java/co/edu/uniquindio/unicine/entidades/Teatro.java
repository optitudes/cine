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
public class Teatro implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTeatro;
    private String  nombre;
    private String  direccion;

    @ManyToOne
    private AdminTeatro adminTeatro;


    //relacion teatro-ciudad
    @ManyToOne
    private Ciudad ciudad;


    //relacion sala-teatro
    @OneToMany(mappedBy = "teatro")
    private List<Sala> salas;


    public Teatro(String nombre, String direccion, Ciudad ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
}
