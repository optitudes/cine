package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Pelicula implements Serializable {
    @Id
    private Integer idPelicula;
    private String  nombre;
    private String  trailer;
    private String  img;
    private String  sinopsis;
    private String  estado;
    private String  tipo;
    private String  reparto;

    public Pelicula() {
    }

    public Pelicula(Integer idPelicula, String nombre, String trailer, String img, String sinopsis, String estado, String tipo, String reparto) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.trailer = trailer;
        this.img = img;
        this.sinopsis = sinopsis;
        this.estado = estado;
        this.tipo = tipo;
        this.reparto = reparto;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", nombre='" + nombre + '\'' +
                ", trailer='" + trailer + '\'' +
                ", img='" + img + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                ", reparto='" + reparto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;

        return Objects.equals(idPelicula, pelicula.idPelicula);
    }

    @Override
    public int hashCode() {
        return idPelicula != null ? idPelicula.hashCode() : 0;
    }
}
