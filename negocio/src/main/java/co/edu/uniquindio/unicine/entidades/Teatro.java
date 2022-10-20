package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    private Integer idTeatro;
    private String  nombre;
    private String  direccion;


    @ManyToOne
    private Ciudad ciudad;

    @OneToMany(mappedBy = "teatro")
    private List<Sala> salas;

}
