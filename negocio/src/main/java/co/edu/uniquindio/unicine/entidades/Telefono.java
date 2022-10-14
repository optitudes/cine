package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Telefono implements Serializable {
    @Id
    private Integer numero;
    private String  tipo;


    public Telefono() {
    }

    public Telefono(Integer numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
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



    @Override
    public String toString() {
        return "Telefono{" +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +

                '}';
    }

}
