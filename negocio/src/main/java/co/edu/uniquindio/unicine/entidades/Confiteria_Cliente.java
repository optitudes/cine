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
public class Confiteria_Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer idConfi_Cli;

    private Integer precio;

    @ManyToOne
    private Confiteria confiteria;

    @ManyToOne
    private Factura factura;



}
