package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Confiteria implements Serializable {
    @Id
    private Integer idConfiteria;
    private String  nombre;
    private Integer precio;

    public Confiteria() {
    }

    public Integer getIdConfiteria() {
        return idConfiteria;
    }

    public void setIdConfiteria(Integer idConfiteria) {
        this.idConfiteria = idConfiteria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Confiteria{" +
                "idConfiteria=" + idConfiteria +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Confiteria that = (Confiteria) o;

        return Objects.equals(idConfiteria, that.idConfiteria);
    }

    @Override
    public int hashCode() {
        return idConfiteria != null ? idConfiteria.hashCode() : 0;
    }
}
