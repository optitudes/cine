package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Sala implements Serializable{
    @Id
    @EqualsAndHashCode.Include
    private Integer idSala;

    @ManyToOne
    private Teatro teatro;

    @OneToMany(mappedBy = "sala")
    private List<Silla> sillas;

    @OneToMany(mappedBy = "sala")
    private List<Funcion> funciones;


}
