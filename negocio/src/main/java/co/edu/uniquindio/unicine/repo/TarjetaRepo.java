package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Entrada;
import co.edu.uniquindio.unicine.entidades.Silla;
import co.edu.uniquindio.unicine.entidades.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TarjetaRepo extends JpaRepository<Tarjeta, Integer> {

    @Query("select  c from Tarjeta c ,Cliente b where c.idTarjeta =?1 and b.cedula=?2 ")
    Tarjeta obtenerTarjetaCliente(int tarjeta, int cedula);

    @Query("select  c from  Tarjeta c where c.idTarjeta =?1 ")
    Tarjeta  obtenerTarjeta (int tarjeta);

}
