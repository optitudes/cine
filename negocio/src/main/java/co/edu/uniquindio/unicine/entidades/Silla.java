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
public class Silla implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer idSilla;

    @ManyToOne
    private Sala sala;

    @OneToMany(mappedBy = "silla")
    private List<Ubica_Silla> ubicacionSillas;
}
