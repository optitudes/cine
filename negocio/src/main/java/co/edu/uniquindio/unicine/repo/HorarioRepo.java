package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HorarioRepo extends JpaRepository<Horario, Integer> {
    @Query("select  c from Funcion c ,Horario b where c.idFuncion =?1 and b.idHora=?2 ")
    Horario obtenerHorarioFuncion(int funcion, int horario);

    @Query("select  c from Horario c where c.idHora =?1 ")
    Horario obtenerHorario(int horario);


}
