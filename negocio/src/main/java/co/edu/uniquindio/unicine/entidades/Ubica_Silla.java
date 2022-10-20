package co.edu.uniquindio.unicine.entidades;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
public class Ubica_Silla implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer idUbica;

    @ManyToOne
    private Silla silla;


}
