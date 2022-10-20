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

    @OneToMany(mappedBy = "factura")
    private List<Confiteria_Cliente> confiteria_clientes;

    @OneToMany(mappedBy = "factura")
    private List<Cliente_Merchandising> cliente_merchandisings;

    @OneToMany(mappedBy = "factura")
    private List<Entrada> entradas;

}
