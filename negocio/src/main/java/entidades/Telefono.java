package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Telefono implements Serializable {
    @Id
    private Integer numero;
    private String  tipo;
    private Integer clienteCedula;

    public Telefono() {
    }



    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(Integer clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", clienteCedula=" + clienteCedula +
                '}';
    }

}
