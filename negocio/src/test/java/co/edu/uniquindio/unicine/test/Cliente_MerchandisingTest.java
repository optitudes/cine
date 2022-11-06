package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Cliente_Merchandising;
import co.edu.uniquindio.unicine.entidades.Factura;
import co.edu.uniquindio.unicine.entidades.Merchandising;
import co.edu.uniquindio.unicine.repo.Cliente_MerchandisingRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Cliente_MerchandisingTest {
    @Autowired
    private Cliente_MerchandisingRepo clienteMRepo;

    @Test
    public void registrarClienteM() {
        Cliente_Merchandising clienteM = new Cliente_Merchandising();
        Merchandising merchandising = new Merchandising();
        Factura factura = new Factura();

        merchandising.setImg("null");
        merchandising.setPrecio(20.4);
        merchandising.setNombre("papa");

        clienteM.setMerchandising(merchandising);
        clienteM.setFactura(factura);

        Cliente_Merchandising clienteMGuardada = clienteMRepo.save(clienteM);
        System.out.println("merchandising guardado "+clienteMGuardada);
        Assertions.assertNotNull(clienteMGuardada);
    }
    @Test
    public void eliminarClienteM() {
        Cliente_Merchandising clienteM = new Cliente_Merchandising();
        Merchandising merchandising = new Merchandising();
        Factura factura = new Factura();

        merchandising.setImg("null");
        merchandising.setPrecio(20.4);
        merchandising.setNombre("papa");

        clienteM.setMerchandising(merchandising);
        clienteM.setFactura(factura);

        Cliente_Merchandising clienteMGuardada = clienteMRepo.save(clienteM);



        clienteMRepo.delete(clienteM);
        Cliente_Merchandising clienteMBuscada = clienteMRepo.findById(clienteMGuardada.getIdClienteMerchandising()).orElse(null);
        System.out.println("----------> "+clienteMBuscada);
        Assertions.assertNull(clienteMBuscada);
    }
    @Test
    public void actualizarClienteM(){
         Cliente_Merchandising clienteM = new Cliente_Merchandising();
        Merchandising merchandising = new Merchandising();
        Factura factura = new Factura();

        merchandising.setImg("null");
        merchandising.setPrecio(20.4);
        merchandising.setNombre("papa");

        clienteM.setMerchandising(merchandising);
        clienteM.setFactura(factura);

        Cliente_Merchandising clienteMGuardada = clienteMRepo.save(clienteM);
        System.out.println("merchandising guardado "+clienteMGuardada);
        Assertions.assertNotNull(clienteMGuardada);

        clienteM.getMerchandising().setNombre("arroz con huevo");

        Cliente_Merchandising clienteMActualizado = clienteMRepo.save(clienteM);
        Cliente_Merchandising clienteMActualizadoBuscado = clienteMRepo.findById(clienteMActualizado.getIdClienteMerchandising()).orElse(null);
        System.out.println("clienteM guardado"+clienteMGuardada);
        System.out.println("clienteM actualizado"+clienteMActualizado);
        System.out.println("clienteM buscado"+clienteMActualizadoBuscado);
        Assertions.assertNotNull(clienteMActualizadoBuscado);
    }
    @Test
    public void listarClienteMTest(){
        List<Cliente_Merchandising> lista = clienteMRepo.findAll();
        System.out.println(lista);
    }

}
