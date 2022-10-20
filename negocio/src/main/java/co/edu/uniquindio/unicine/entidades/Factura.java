package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Factura implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer idFactura;
    private Integer confiCliIdConfiCli;
    private Integer entradasIdEntradas;

    @ManyToOne
    private Cliente cliente;

    @OneToOne(mappedBy = "factura")
    private Cupon cupon;


}
