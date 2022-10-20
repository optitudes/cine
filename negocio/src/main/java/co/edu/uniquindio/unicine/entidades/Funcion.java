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

    @OneToMany(mappedBy = "funcion")
    private List<Entrada> entradas;


}
