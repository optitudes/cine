package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Silla;
import co.edu.uniquindio.unicine.entidades.Ubica_Silla;
import co.edu.uniquindio.unicine.repo.Ubica_SillaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UbicaSillaTest {
    @Autowired
    private Ubica_SillaRepo ubicaSR;
    @Test
    public void registrarUbicaSilla() {
        Ubica_Silla ubicaS = new Ubica_Silla();

        Ubica_Silla ubicaSGuardada = ubicaSR.save(ubicaS);
        Assertions.assertNotNull(ubicaSGuardada);
    }
    @Test
    public void eliminarUbicaSilla() {
        Ubica_Silla ubicaS = new Ubica_Silla();

        Ubica_Silla ubicaSGuardada = ubicaSR.save(ubicaS);
        ubicaSR.delete(ubicaSGuardada);
        Ubica_Silla ubicaSBuscada = ubicaSR.findById(ubicaSGuardada.getIdUbica()).orElse(null);
        System.out.println("----------> "+ubicaSBuscada);
        Assertions.assertNull(ubicaSBuscada);
    }
    @Test
    public void actualizarUbicaSilla(){
        Ubica_Silla ubicaS = new Ubica_Silla();

        Ubica_Silla ubicaSGuardada = ubicaSR.save(ubicaS);
        System.out.println("ubica silla guardada ->"+ubicaSGuardada.toString());
        ubicaSGuardada.setSilla(new Silla());

        Ubica_Silla ubicaSActualizada = ubicaSR.save(ubicaSGuardada);
        Ubica_Silla ubicaSActualizadaBuscada = ubicaSR.findById(ubicaSActualizada.getIdUbica()).orElse(null);
        System.out.println("ubica silla  acturalizada ->"+ubicaSActualizadaBuscada.toString());
        Assertions.assertNotNull(ubicaSActualizadaBuscada);
    }
    @Test
    public void listarUbicaSillas(){
        List<Ubica_Silla> lista = ubicaSR.findAll();
        System.out.println("list of Ubica sillas "+lista.toString());
    }
}
