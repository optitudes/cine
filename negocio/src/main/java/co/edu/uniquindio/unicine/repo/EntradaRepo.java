package co.edu.uniquindio.unicine.repo;
import co.edu.uniquindio.unicine.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepo extends JpaRepository<Entrada, Integer> {
    @Query("select  c from Entrada c ,Factura b where c.idEntrada =?1 and b.idFactura=?2 ")
    Entrada obtenerEntradaCliente(int Entrada, int factura);

    @Query("select  c from Entrada c where c.idEntrada =?1 ")
    Entrada obtenerEntrada(int entrada);
}