package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Ciudad implements Serializable {
    @Id
    private Integer idCiudad;
    private String  nombre;
    private Integer departamentoIdDepartamento;

    public Ciudad() {
    }

    public Ciudad(Integer idCiudad, String nombre, Integer departamentoIdDepartamento) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDepartamentoIdDepartamento() {
        return departamentoIdDepartamento;
    }

    public void setDepartamentoIdDepartamento(Integer departamentoIdDepartamento) {
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "idCiudad=" + idCiudad +
                ", nombre='" + nombre + '\'' +
                ", departamentoIdDepartamento=" + departamentoIdDepartamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ciudad ciudad = (Ciudad) o;

        return Objects.equals(idCiudad, ciudad.idCiudad);
    }

    @Override
    public int hashCode() {
        return idCiudad != null ? idCiudad.hashCode() : 0;
    }
}
