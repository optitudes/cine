package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Administrator implements Serializable {

    //id_adm in
    @Id
    private Integer idAdmin;
    private String email;
    private int contra;

    public Administrator() {
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "idAdmin=" + idAdmin +
                ", email='" + email + '\'' +
                ", contra='" + contra + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrator that = (Administrator) o;

        return Objects.equals(idAdmin, that.idAdmin);
    }

    @Override
    public int hashCode() {
        return idAdmin != null ? idAdmin.hashCode() : 0;
    }
}
