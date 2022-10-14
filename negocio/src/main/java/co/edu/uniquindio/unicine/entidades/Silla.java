package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Silla implements Serializable {
    @Id
    private Integer idSilla;


    public Silla() {
    }

    public Silla(Integer idSilla) {
        this.idSilla = idSilla;
    }

    public Integer getIdSilla() {
        return idSilla;
    }

    public void setIdSilla(Integer idSilla) {
        this.idSilla = idSilla;
    }



    @Override
    public String toString() {
        return "Silla{" +
                "idSilla=" + idSilla +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Silla silla = (Silla) o;

        return Objects.equals(idSilla, silla.idSilla);
    }

    @Override
    public int hashCode() {
        return idSilla != null ? idSilla.hashCode() : 0;
    }
}
