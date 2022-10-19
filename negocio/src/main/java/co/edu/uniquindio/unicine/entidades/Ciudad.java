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
public class Ciudad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer idCiudad;
    private String nombre;

    @OneToMany(mappedBy="ciudad")
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "ciudad")
    private List<Teatro> teatros;



}
