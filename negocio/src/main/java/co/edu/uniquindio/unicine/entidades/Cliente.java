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
public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer cedula;
    private String  nombreCompleto;
    private String  email;
    private String  imgPerfil;
    private String  contrasenia;
    private Tarjeta tarjeta;

    @ManyToOne
    private Ciudad ciudad;

    @OneToMany(mappedBy = "cliente")
    private List<Telefono> telefonos;

    @OneToMany(mappedBy = "cliente")
    private List<Cupon> cupones;





}
