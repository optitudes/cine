package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class AdminTeatro implements Serializable {
    @Id
    private Integer idAdminTeatro;
    private String  email;
    private String  contra;

    public AdminTeatro() {

    }

    public Integer getIdAdminTeatro() {
        return idAdminTeatro;
    }

    public void setIdAdminTeatro(Integer idAdminTeatro) {
        this.idAdminTeatro = idAdminTeatro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "AdminTeatro{" +
                "idAdminTeatro=" + idAdminTeatro +
                ", email='" + email + '\'' +
                ", contra='" + contra + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminTeatro that = (AdminTeatro) o;

        return Objects.equals(idAdminTeatro, that.idAdminTeatro);
    }

    @Override
    public int hashCode() {
        return idAdminTeatro != null ? idAdminTeatro.hashCode() : 0;
    }
}
