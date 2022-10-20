package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Merchandising  implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private  Integer idMerchandising;
    private  String img;
    private  Double precio;
    private  String nombre;

    @OneToMany(mappedBy = "merchandising")
    private List<Cliente_Merchandising> cliente_merchandisings;


}
