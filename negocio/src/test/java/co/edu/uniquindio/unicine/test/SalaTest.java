package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Sala;
import co.edu.uniquindio.unicine.entidades.Teatro;
import co.edu.uniquindio.unicine.repo.SalaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SalaTest {
    @Autowired
    private SalaRepo salaR;
    @Test
    public void registrarSala() {
        Sala sala = new Sala();

        Sala salaGuardada = salaR.save(sala);
        Assertions.assertNotNull(salaGuardada);
    }
    @Test
    public void eliminarSala() {
        Sala sala = new Sala();

        Sala salaGuardada = salaR.save(sala);
        salaR.delete(salaGuardada);
        Sala salaBuscada = salaR.findById(salaGuardada.getIdSala()).orElse(null);
        System.out.println("----------> "+salaBuscada);
        Assertions.assertNull(salaBuscada);
    }
    @Test
    public void actualizarSala(){
        Sala sala = new Sala();

        Sala salaGuardada = salaR.save(sala);
        System.out.println("sala guardada ->"+salaGuardada.toString());
        salaGuardada.setTeatro(new Teatro());

        Sala salaActualizada = salaR.save(salaGuardada);
        Sala salaActualizadaBuscada = salaR.findById(salaActualizada.getIdSala()).orElse(null);
        System.out.println("sala  acturalizada ->"+salaActualizadaBuscada.toString());
        Assertions.assertNotNull(salaActualizadaBuscada);
    }
    @Test
    public void listarSalas(){
        List<Sala> lista = salaR.findAll();
        System.out.println("list of salas "+lista.toString());
    }
}
