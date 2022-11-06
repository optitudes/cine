package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Tarjeta;
import co.edu.uniquindio.unicine.entidades.TipoTarjeta;
import co.edu.uniquindio.unicine.repo.TarjetaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TarjetaTest {
    @Autowired
    private TarjetaRepo tarjetaR;
    @Test
    public void registrarTarjeta() {
        Tarjeta tarjeta = new Tarjeta();

        Tarjeta tarjetaGuardada = tarjetaR.save(tarjeta);
        Assertions.assertNotNull(tarjetaGuardada);
    }
    @Test
    public void eliminarTarjeta() {
        Tarjeta tarjeta = new Tarjeta();

        Tarjeta tarjetaGuardada = tarjetaR.save(tarjeta);
        tarjetaR.delete(tarjetaGuardada);
        Tarjeta tarjetaBuscada = tarjetaR.findById(tarjetaGuardada.getIdTarjeta()).orElse(null);
        System.out.println("----------> "+tarjetaBuscada);
        Assertions.assertNull(tarjetaBuscada);
    }
    @Test
    public void actualizarTarjeta(){
        Tarjeta tarjeta = new Tarjeta();

        Tarjeta tarjetaGuardada = tarjetaR.save(tarjeta);
        System.out.println("tarjeta guardada ->"+tarjetaGuardada.toString());
        tarjetaGuardada.setTipoTarjeta(TipoTarjeta.AHORRO);

        Tarjeta tarjetaActualizada = tarjetaR.save(tarjetaGuardada);
        Tarjeta tarjetaActualizadaBuscada = tarjetaR.findById(tarjetaActualizada.getIdTarjeta()).orElse(null);
        System.out.println("tarjeta  acturalizada ->"+tarjetaActualizadaBuscada.toString());
        Assertions.assertNotNull(tarjetaActualizadaBuscada);
    }
    @Test
    public void listarTargetas(){
        List<Tarjeta> lista = tarjetaR.findAll();
        System.out.println("list of tarjetas "+lista.toString());
    }
}
