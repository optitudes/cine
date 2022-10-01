package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Silla implements Serializable {
    @Id
    private Integer idSilla;
    private Integer salaIdSala;

    public Silla() {
    }

    public Integer getIdSilla() {
        return idSilla;
    }

    public void setIdSilla(Integer idSilla) {
        this.idSilla = idSilla;
    }

    public Integer getSalaIdSala() {
        return salaIdSala;
    }

    public void setSalaIdSala(Integer salaIdSala) {
        this.salaIdSala = salaIdSala;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "idSilla=" + idSilla +
                ", salaIdSala=" + salaIdSala +
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
