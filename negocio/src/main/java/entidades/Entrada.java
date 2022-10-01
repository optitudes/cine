package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Entrada implements Serializable {
    @Id
    private Integer idEntrada;
    private Integer peliculaIdPelicula;
    private Integer cantidadEntradas;
    private Integer clienteCedula;
    private Integer ubicacionIdUbicacion;
    private Integer facturaIdFactura;
    private Integer horaPeliIdHoraPeli;

    public Entrada() {
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getPeliculaIdPelicula() {
        return peliculaIdPelicula;
    }

    public void setPeliculaIdPelicula(Integer peliculaIdPelicula) {
        this.peliculaIdPelicula = peliculaIdPelicula;
    }

    public Integer getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(Integer cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public Integer getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(Integer clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public Integer getUbicacionIdUbicacion() {
        return ubicacionIdUbicacion;
    }

    public void setUbicacionIdUbicacion(Integer ubicacionIdUbicacion) {
        this.ubicacionIdUbicacion = ubicacionIdUbicacion;
    }

    public Integer getFacturaIdFactura() {
        return facturaIdFactura;
    }

    public void setFacturaIdFactura(Integer facturaIdFactura) {
        this.facturaIdFactura = facturaIdFactura;
    }

    public Integer getHoraPeliIdHoraPeli() {
        return horaPeliIdHoraPeli;
    }

    public void setHoraPeliIdHoraPeli(Integer horaPeliIdHoraPeli) {
        this.horaPeliIdHoraPeli = horaPeliIdHoraPeli;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "idEntrada=" + idEntrada +
                ", peliculaIdPelicula=" + peliculaIdPelicula +
                ", cantidadEntradas=" + cantidadEntradas +
                ", clienteCedula=" + clienteCedula +
                ", ubicacionIdUbicacion=" + ubicacionIdUbicacion +
                ", facturaIdFactura=" + facturaIdFactura +
                ", horaPeliIdHoraPeli=" + horaPeliIdHoraPeli +
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
