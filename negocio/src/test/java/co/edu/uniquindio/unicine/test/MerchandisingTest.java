package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Merchandising;
import co.edu.uniquindio.unicine.repo.MerchandasingRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MerchandisingTest {
    @Autowired
    private MerchandasingRepo merchandisingR;
    @Test
    public void registrarMerchandising() {
        Merchandising merchandising = new Merchandising();

        Merchandising merchandisingGuardado = merchandisingR.save(merchandising);
        Assertions.assertNotNull(merchandisingGuardado);
    }
    @Test
    public void eliminarFuncion() {
        Merchandising merchandising = new Merchandising();

        Merchandising merchandisingGuardado = merchandisingR.save(merchandising);
        merchandisingR.delete(merchandisingGuardado);
        Merchandising merchandisingBuscado = merchandisingR.findById(merchandisingGuardado.getIdMerchandising()).orElse(null);
        System.out.println("----------> "+merchandisingBuscado);
        Assertions.assertNull(merchandisingBuscado);
    }
    @Test
    public void actualizarFuncion(){
        Merchandising merchandising = new Merchandising();

        Merchandising merchandisingGuardado = merchandisingR.save(merchandising);

        System.out.println("merchandising guardado ->"+merchandisingGuardado.toString());
        merchandisingGuardado.setPrecio(500.0);

        Merchandising merchandisingActualizado = merchandisingR.save(merchandisingGuardado);
        Merchandising merchandisingActualizadoBuscada = merchandisingR.findById(merchandisingActualizado.getIdMerchandising()).orElse(null);
        System.out.println("merchandising acturalizado ->"+merchandisingActualizadoBuscada.toString());
        Assertions.assertNotNull(merchandisingActualizadoBuscada);
    }
    @Test
    public void listarFunciones(){
        List<Merchandising> lista = merchandisingR.findAll();
        System.out.println("list of merchandising "+lista.toString());
    }


}
