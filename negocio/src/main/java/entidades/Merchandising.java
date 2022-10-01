package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlIDREF;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Merchandising implements Serializable {
    @Id
    private  Integer idMerchandising;
    private  String img;
    private  Double precio;
    private  String nombre;

    public Merchandising() {
    }

    public Integer getIdMerchandising() {
        return idMerchandising;
    }

    public void setIdMerchandising(Integer idMerchandising) {
        this.idMerchandising = idMerchandising;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Merchandising{" +
                "idMerchandising=" + idMerchandising +
                ", img='" + img + '\'' +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Merchandising that = (Merchandising) o;

        return Objects.equals(idMerchandising, that.idMerchandising);
    }

    @Override
    public int hashCode() {
        return idMerchandising != null ? idMerchandising.hashCode() : 0;
    }
}
