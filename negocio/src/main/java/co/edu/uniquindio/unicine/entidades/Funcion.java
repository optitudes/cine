package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Funcion implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer idFuncion;

    @ManyToOne
    private Horario horario;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Pelicula pelicula;


}
