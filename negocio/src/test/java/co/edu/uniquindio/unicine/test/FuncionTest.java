package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Funcion;
import co.edu.uniquindio.unicine.entidades.Pelicula;
import co.edu.uniquindio.unicine.entidades.Sala;
import co.edu.uniquindio.unicine.repo.FuncionRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FuncionTest {
    @Autowired
    private FuncionRepo funcionRepo;
    @Test
    public void registrarFuncion() {
        Funcion funcion = new Funcion();

        Funcion funcionGuardada = funcionRepo.save(funcion);
        Assertions.assertNotNull(funcionGuardada);
    }
    @Test
    public void eliminarFuncion() {
        Funcion funcion = new Funcion();

        Funcion funcionGuardada = funcionRepo.save(funcion);
        funcionRepo.delete(funcionGuardada);
        Funcion funcionBuscada = funcionRepo.findById(funcionGuardada.getIdFuncion()).orElse(null);
        System.out.println("----------> "+funcionBuscada);
        Assertions.assertNull(funcionBuscada);
    }
    @Test
    public void actualizarFuncion(){
        Funcion funcion = new Funcion();

        Funcion funcionGuardada = funcionRepo.save(funcion);
        funcionGuardada.setSala(new Sala());
        funcionGuardada.setPelicula(new Pelicula());

        Funcion funcionActualizada = funcionRepo.save(funcionGuardada);
        Funcion funcionActualizadaBuscada = funcionRepo.findById(funcionActualizada.getIdFuncion()).orElse(null);
        Assertions.assertNotNull(funcionActualizadaBuscada);
    }
    @Test
    public void listarFunciones(){
        List<Funcion> lista = funcionRepo.findAll();
        System.out.println(lista);
    }
}
