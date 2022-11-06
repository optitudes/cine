package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Pelicula;
import co.edu.uniquindio.unicine.repo.PeliculaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PeliculaTest {
    @Autowired
    private PeliculaRepo peliR;
    @Test
    public void registrarPelicula() {
        Pelicula peli = new Pelicula();

        Pelicula peliGuardada = peliR.save(peli);
        Assertions.assertNotNull(peliGuardada);
    }
    @Test
    public void eliminarPelicula() {
        Pelicula peli = new Pelicula();

        Pelicula peliGuardada = peliR.save(peli);
        peliR.delete(peliGuardada);
        Pelicula peliBuscada = peliR.findById(peliGuardada.getIdPelicula()).orElse(null);
        System.out.println("----------> "+peliBuscada);
        Assertions.assertNull(peliBuscada);
    }
    @Test
    public void actualizarPelicula(){
        Pelicula peli = new Pelicula();

        Pelicula peliGuardada = peliR.save(peli);

        System.out.println("peli guardada ->"+peliGuardada.toString());
        peliGuardada.setNombre("Enemy");

        Pelicula peliActualizada = peliR.save(peliGuardada);
        Pelicula peliActualizadaBuscada = peliR.findById(peliActualizada.getIdPelicula()).orElse(null);
        System.out.println("pelicula  acturalizada ->"+peliActualizadaBuscada.toString());
        Assertions.assertNotNull(peliActualizadaBuscada);
    }
    @Test
    public void listarFunciones(){
        List<Pelicula> lista = peliR.findAll();
        System.out.println("list of pelis "+lista.toString());
    }
}
