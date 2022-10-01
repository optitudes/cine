package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Cliente implements Serializable {
    @Id
    private Integer cedula;
    private String  nombreCompleto;
    private String  email;
    private String  imgPerfil;
    private String  contrasenia;
    private Integer ciudadIdCiudad;
    private Integer tarjetaIdTarjeta;

    public Cliente() {
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Integer getCiudadIdCiudad() {
        return ciudadIdCiudad;
    }

    public void setCiudadIdCiudad(Integer ciudadIdCiudad) {
        this.ciudadIdCiudad = ciudadIdCiudad;
    }

    public Integer getTarjetaIdTarjeta() {
        return tarjetaIdTarjeta;
    }

    public void setTarjetaIdTarjeta(Integer tarjetaIdTarjeta) {
        this.tarjetaIdTarjeta = tarjetaIdTarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                ", imgPerfil='" + imgPerfil + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", ciudadIdCiudad=" + ciudadIdCiudad +
                ", tarjetaIdTarjeta=" + tarjetaIdTarjeta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return Objects.equals(cedula, cliente.cedula);
    }

    @Override
    public int hashCode() {
        return cedula != null ? cedula.hashCode() : 0;
    }
}
