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
public class Pelicula implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPelicula;
    private String  nombre;
    private String  trailer;
    private String  img;
    private String  sinopsis;
    private String  estado;
    private String  tipo;
    private String  reparto;

    @OneToMany(mappedBy = "pelicula")
    private List<Funcion> funciones;

    @OneToMany(mappedBy = "pelicula")
    private List<Entrada> entradas;

    public Pelicula(String nombre, String trailer, String img, String sinopsis, String estado, String tipo, String reparto) {
        this.nombre = nombre;
        this.trailer = trailer;
        this.img = img;
        this.sinopsis = sinopsis;
        this.estado = estado;
        this.tipo = tipo;
        this.reparto = reparto;
    }
}
