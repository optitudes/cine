package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Ciudad;
import co.edu.uniquindio.unicine.repo.CiudadRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CiudadTest {
    @Autowired
    private CiudadRepo ciudadRepo;


    @Test
    public void registrarCiudad() {
        Ciudad ciudad = new Ciudad();

        ciudad.setIdCiudad(123);
        ciudad.setNombre("barrancabermeja");
        Ciudad ciudadGuardada = ciudadRepo.save(ciudad);
        Assertions.assertNotNull(ciudadGuardada);
    }

    @Test
    public void eliminarCiudad() {
        Ciudad ciudad = new Ciudad();

        ciudad.setIdCiudad(123);
        ciudad.setNombre("barrancabermeja");
        Ciudad ciudadGuardada = ciudadRepo.save(ciudad);
        ciudadRepo.delete(ciudad);
        Ciudad ciudadBuscada = ciudadRepo.findById(123).orElse(null);
        System.out.println("----------> "+ciudadBuscada);
        Assertions.assertNull(ciudadBuscada);
    }

    @Test
    public void actualizarCiudad(){
        Ciudad ciudad = new Ciudad();

        ciudad.setIdCiudad(123);
        ciudad.setNombre("barrancabermeja");
        Ciudad ciudadGuardada = ciudadRepo.save(ciudad);
        Assertions.assertNotNull(ciudadGuardada);
        ciudad.setNombre("calarca");
        Ciudad ciudadActualizada = ciudadRepo.save(ciudad);
        Ciudad ciudadBuscada = ciudadRepo.findById(123).orElse(null);
        Assertions.assertNotNull(ciudadGuardada);

    }
    @Test
    public void listarCiudadesTest(){
        List<Ciudad> lista = ciudadRepo.findAll();
        System.out.println(lista);
    }

}
