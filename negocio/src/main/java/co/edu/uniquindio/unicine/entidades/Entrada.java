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
public class Entrada implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer idEntrada;
    private Integer cantidadEntradas;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Funcion funcion;

    @ManyToOne
    private Pelicula pelicula;

    @ManyToOne
    private Ubica_Silla ubica_silla;


}
