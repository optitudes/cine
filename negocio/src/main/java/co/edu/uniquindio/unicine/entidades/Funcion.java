package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Funcion implements Serializable {
    @Id
    private Integer idFuncion;


    public Funcion() {
    }

    public Funcion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }



    @Override
    public String toString() {
        return "Funcion{" +
                "idFuncion=" + idFuncion +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcion funcion = (Funcion) o;

        return Objects.equals(idFuncion, funcion.idFuncion);
    }

    @Override
    public int hashCode() {
        return idFuncion != null ? idFuncion.hashCode() : 0;
    }
}
