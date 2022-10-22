package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Cupon implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer   idCupon;
    private Double   valorCupon;
    private LocalDate fechVenci;
    private String    criterio;

    private String    estado;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Factura factura;


    public Cupon(Double valorCupon, LocalDate fechVenci, String criterio, String estado, Cliente cliente, Factura factura) {
        this.valorCupon = valorCupon;
        this.fechVenci = fechVenci;
        this.criterio = criterio;
        this.estado = estado;
        this.cliente = cliente;
        this.factura = factura;
    }
}
