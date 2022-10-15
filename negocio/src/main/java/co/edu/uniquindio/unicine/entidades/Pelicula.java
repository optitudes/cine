package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString



@Entity
public class Pelicula implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer idPelicula;
    private String  nombre;
    private String  trailer;
    private String  img;
    private String  sinopsis;
    private String  estado;
    private String  tipo;
    private String  reparto;

}
