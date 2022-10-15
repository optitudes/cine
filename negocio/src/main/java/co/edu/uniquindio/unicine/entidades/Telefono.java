package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString



@Entity
public class Telefono implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer numero;
    private String  tipo;


}
