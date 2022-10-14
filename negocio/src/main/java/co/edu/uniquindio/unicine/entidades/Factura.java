package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Factura implements Serializable {
    @Id
    private Integer idFactura;
    private Integer confiCliIdConfiCli;
    private Integer entradasIdEntradas;


    public Factura() {
    }

    public Factura(Integer idFactura, Integer confiCliIdConfiCli, Integer entradasIdEntradas) {
        this.idFactura = idFactura;
        this.confiCliIdConfiCli = confiCliIdConfiCli;
        this.entradasIdEntradas = entradasIdEntradas;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getConfiCliIdConfiCli() {
        return confiCliIdConfiCli;
    }

    public void setConfiCliIdConfiCli(Integer confiCliIdConfiCli) {
        this.confiCliIdConfiCli = confiCliIdConfiCli;
    }

    public Integer getEntradasIdEntradas() {
        return entradasIdEntradas;
    }

    public void setEntradasIdEntradas(Integer entradasIdEntradas) {
        this.entradasIdEntradas = entradasIdEntradas;
    }



    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", confiCliIdConfiCli=" + confiCliIdConfiCli +
                ", entradasIdEntradas=" + entradasIdEntradas +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factura factura = (Factura) o;

        return Objects.equals(idFactura, factura.idFactura);
    }

    @Override
    public int hashCode() {
        return idFactura != null ? idFactura.hashCode() : 0;
    }
}
