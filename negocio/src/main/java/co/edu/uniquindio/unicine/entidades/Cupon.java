package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Cupon implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Integer   idCupon;
    private Double   valorCupon;
    private LocalDate fechVenci;
    private String    criterio;

    private String    estado;

    public Cupon() {
    }

    public Cupon(Integer idCupon, Double valorCupon, LocalDate fechVenci, String criterio, String estado) {
        this.idCupon = idCupon;
        this.valorCupon = valorCupon;
        this.fechVenci = fechVenci;
        this.criterio = criterio;
        this.estado = estado;
    }

    public Integer getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(Integer idCupon) {
        this.idCupon = idCupon;
    }

    public Double getValorCupon() {
        return valorCupon;
    }

    public void setValorCupon(Double valorCupon) {
        this.valorCupon = valorCupon;
    }

    public LocalDate getFechVenci() {
        return fechVenci;
    }

    public void setFechVenci(LocalDate fechVenci) {
        this.fechVenci = fechVenci;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }



    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cupon{" +
                "idCupon=" + idCupon +
                ", valorCupon=" + valorCupon +
                ", fechVenci=" + fechVenci +
                ", criterio='" + criterio + '\'' +

                ", estado='" + estado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cupon cupon = (Cupon) o;

        return Objects.equals(idCupon, cupon.idCupon);
    }

    @Override
    public int hashCode() {
        return idCupon != null ? idCupon.hashCode() : 0;
    }
}
