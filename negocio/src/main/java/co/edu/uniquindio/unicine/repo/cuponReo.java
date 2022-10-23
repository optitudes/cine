package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Confiteria;
import co.edu.uniquindio.unicine.entidades.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface cuponReo extends JpaRepository<Cupon, Integer> {

    @Query("select  c from Cupon c ,Cliente b where c.criterio =?1 and b.nombreCompleto=?2 ")
    Cupon obtenerCuponCliente (String cupon, String  cliente);

    @Query("select  c from Cupon c where c.idCupon =?1 ")
    Cupon obtenerCupon (int  Cupon);
}
