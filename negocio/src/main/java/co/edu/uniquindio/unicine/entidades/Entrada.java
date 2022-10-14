package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Entrada implements Serializable {
    @Id
    private Integer idEntrada;
    private Integer cantidadEntradas;


    public Entrada() {
    }

    public Entrada(Integer idEntrada, Integer cantidadEntradas) {
        this.idEntrada = idEntrada;
        this.cantidadEntradas = cantidadEntradas;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(Integer cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }




    @Override
    public String toString() {
        return "Entrada{" +
                "idEntrada=" + idEntrada +

                ", cantidadEntradas=" + cantidadEntradas +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entrada entrada = (Entrada) o;

        return Objects.equals(idEntrada, entrada.idEntrada);
    }

    @Override
    public int hashCode() {
        return idEntrada != null ? idEntrada.hashCode() : 0;
    }
}
