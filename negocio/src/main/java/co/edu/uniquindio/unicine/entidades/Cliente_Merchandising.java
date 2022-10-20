package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Cliente_Merchandising implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer idCliente_Merchandising;

    @ManyToOne
    private Merchandising merchandising;

    @ManyToOne
    private Factura factura;

}
