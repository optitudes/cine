package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionRepo extends JpaRepository<Funcion, Integer> {
    @Query("select  c from Funcion c ,Entrada b where c.idFuncion =?1 and b.idEntrada=?2 ")
    Funcion obtenerFuncionEntrada(int funcion, int entrada);

    @Query("select  c from Funcion c where c.idFuncion =?1 ")
    Funcion obtenerFuncion(int funcion);

}
