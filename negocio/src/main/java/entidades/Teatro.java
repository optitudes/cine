package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Teatro implements Serializable {
    @Id
    private Integer idTeatro;
    private String  nombre;
    private String  direccion;
    private Integer ciudadIdCiudad;

    public Teatro() {
    }

    public Integer getIdTeatro() {
        return idTeatro;
    }

    public void setIdTeatro(Integer idTeatro) {
        this.idTeatro = idTeatro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCiudadIdCiudad() {
        return ciudadIdCiudad;
    }

    public void setCiudadIdCiudad(Integer ciudadIdCiudad) {
        this.ciudadIdCiudad = ciudadIdCiudad;
    }

    @Override
    public String toString() {
        return "Teatro{" +
                "idTeatro=" + idTeatro +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudadIdCiudad=" + ciudadIdCiudad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teatro teatro = (Teatro) o;

        return Objects.equals(idTeatro, teatro.idTeatro);
    }

    @Override
    public int hashCode() {
        return idTeatro != null ? idTeatro.hashCode() : 0;
    }
}
