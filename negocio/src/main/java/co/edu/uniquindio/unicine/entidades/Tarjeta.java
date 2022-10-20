package co.edu.uniquindio.unicine.entidades;

import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

public class Tarjeta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer idTarjeta;
    private TipoTarjeta tipoTarjeta;


}
