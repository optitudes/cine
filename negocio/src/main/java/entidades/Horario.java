package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class Horario implements Serializable {
    @Id
    private Integer idHora;
    private LocalTime hora;

    public Horario() {
    }

    public Integer getIdHora() {
        return idHora;
    }

    public void setIdHora(Integer idHora) {
        this.idHora = idHora;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "idHora=" + idHora +
                ", hora=" + hora +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horario horario = (Horario) o;

        return Objects.equals(idHora, horario.idHora);
    }

    @Override
    public int hashCode() {
        return idHora != null ? idHora.hashCode() : 0;
    }
}
