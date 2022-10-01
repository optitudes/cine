package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Funcion implements Serializable {
    @Id
    private Integer idFuncion;
    private Integer peliculaIdPelicula;
    private Integer horaIdHora;
    private Integer salaIdSala;

    public Funcion() {
    }

    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public Integer getPeliculaIdPelicula() {
        return peliculaIdPelicula;
    }

    public void setPeliculaIdPelicula(Integer peliculaIdPelicula) {
        this.peliculaIdPelicula = peliculaIdPelicula;
    }

    public Integer getHoraIdHora() {
        return horaIdHora;
    }

    public void setHoraIdHora(Integer horaIdHora) {
        this.horaIdHora = horaIdHora;
    }

    public Integer getSalaIdSala() {
        return salaIdSala;
    }

    public void setSalaIdSala(Integer salaIdSala) {
        this.salaIdSala = salaIdSala;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "idFuncion=" + idFuncion +
                ", peliculaIdPelicula=" + peliculaIdPelicula +
                ", horaIdHora=" + horaIdHora +
                ", salaIdSala=" + salaIdSala +
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
