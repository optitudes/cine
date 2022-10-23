package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiteriaRepo extends JpaRepository<Confiteria, Integer> {
    @Query("select  c from Confiteria  c,Confiteria_Cliente b where c.idConfiteria =?1 and b.precio=?2 ")
    Confiteria obtenerConfiteriaCliente (int Confiteria, int Confiteria_cli);

    @Query("select  c from Confiteria c where c.idConfiteria =?1 ")
    Confiteria obtenerConfiteria (int Confiteria);


}
