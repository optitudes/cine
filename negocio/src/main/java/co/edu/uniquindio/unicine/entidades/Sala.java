package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Sala implements Serializable{
    @Id
    private Integer idSala;


    public Sala() {
    }

    public Sala(Integer idSala) {
        this.idSala = idSala;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }



    @Override
    public String toString() {
        return "Sala{" +
                "idSala=" + idSala +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sala sala = (Sala) o;

        return Objects.equals(idSala, sala.idSala);
    }

    @Override
    public int hashCode() {
        return idSala != null ? idSala.hashCode() : 0;
    }
}
