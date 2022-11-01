package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepo extends JpaRepository<Factura, Integer> {

    @Query("select  c from Factura c ,Cliente b where c.idFactura =?1 and b.cedula=?2 ")
    Factura obtenerFacturaCliente(int factura, int cedula);

    @Query("select  c from Factura c where c.idFactura =?1 ")
    Factura obtenerFactura(int factura);
}
