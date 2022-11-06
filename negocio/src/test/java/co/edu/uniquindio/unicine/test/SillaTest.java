package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Sala;
import co.edu.uniquindio.unicine.entidades.Silla;
import co.edu.uniquindio.unicine.repo.SillaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SillaTest {
    @Autowired
    private SillaRepo sillaR;
    @Test
    public void registrarSilla() {
        Silla silla = new Silla();

        Silla sillaGuardada = sillaR.save(silla);
        Assertions.assertNotNull(sillaGuardada);
    }
    @Test
    public void eliminarSilla() {
        Silla silla = new Silla();

        Silla sillaGuardada = sillaR.save(silla);
        sillaR.delete(sillaGuardada);
        Silla sillaBuscada = sillaR.findById(sillaGuardada.getIdSilla()).orElse(null);
        System.out.println("----------> "+sillaBuscada);
        Assertions.assertNull(sillaBuscada);
    }
    @Test
    public void actualizarSilla(){
        Silla silla = new Silla();

        Silla sillaGuardada = sillaR.save(silla);
        System.out.println("silla guardada ->"+sillaGuardada.toString());
        sillaGuardada.setSala(new Sala());
        Silla sillaActualizada = sillaR.save(sillaGuardada);
        Silla sillaActualizadaBuscada = sillaR.findById(sillaActualizada.getIdSilla()).orElse(null);
        System.out.println("sala  acturalizada ->"+sillaActualizadaBuscada.toString());
        Assertions.assertNotNull(sillaActualizadaBuscada);
    }
    @Test
    public void listarSillas(){
        List<Silla> lista = sillaR.findAll();
        System.out.println("list of salas "+lista.toString());
    }
}
