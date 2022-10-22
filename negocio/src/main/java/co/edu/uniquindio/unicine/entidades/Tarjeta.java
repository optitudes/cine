package co.edu.uniquindio.unicine.entidades;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Tarjeta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarjeta;
    private TipoTarjeta tipoTarjeta;



    @OneToMany(mappedBy = "tarjeta")
    private List<Cliente> clientes;


}
