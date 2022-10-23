package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Ciudad;
import co.edu.uniquindio.unicine.entidades.Entrada;
import co.edu.uniquindio.unicine.entidades.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalaRepo extends JpaRepository<Sala, Integer> {
    @Query("select  c from Sala c,Funcion b where c.idSala =?1 and b.entradas =?2 ")
   Sala obtenerSalaFuncion (int sala, int entradas);

    @Query("select  c from Sala c where c.idSala =?1 ")
    Sala obtenerSala (int sala);
}
