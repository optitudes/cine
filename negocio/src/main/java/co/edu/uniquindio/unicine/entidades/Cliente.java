package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cedula;
    private String  nombreCompleto;
    private String  email;
    private String  imgPerfil;
    private String  contrasenia;

    @ElementCollection
    private List<String> telefonos;

    private Tarjeta tarjeta;


    public Cliente(String nombreCompleto, String email, String imgPerfil, String contrasenia, List<String> telefonos) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.imgPerfil = imgPerfil;
        this.contrasenia = contrasenia;
        this.telefonos = telefonos;
    }

    @ToString.Exclude
    @ManyToOne
    private Ciudad ciudad;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Cupon> cupones;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Factura> facturas;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Entrada> entradas;



}
