package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Cupon implements Serializable {
    @Id
    private Integer   idCupon;
    private Double   valorCupon;
    private LocalDate fechVenci;
    private String    criterio;
    private Integer   clienteCedula;
    private String    estado;

    public Cupon() {
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

    public Integer getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(Integer clienteCedula) {
        this.clienteCedula = clienteCedula;
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
                ", clienteCedula=" + clienteCedula +
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
