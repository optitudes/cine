package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Horario implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer idHora;
    private LocalTime hora;

    @OneToMany(mappedBy = "horario")
    private List<Funcion> funciones;

}
