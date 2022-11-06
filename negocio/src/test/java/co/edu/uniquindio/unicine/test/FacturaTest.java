package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Cliente;
import co.edu.uniquindio.unicine.entidades.Factura;
import co.edu.uniquindio.unicine.repo.FacturaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FacturaTest {
    @Autowired
    private FacturaRepo factRepo;
    @Test
    public void registrarFactura() {
        Factura factura = new Factura();

        factura.setCliente(new Cliente());
        Factura facturaGuardada = factRepo.save(factura);
        Assertions.assertNotNull(facturaGuardada);
    }
    @Test
    public void eliminarFactura() {
        Factura factura = new Factura();

        factura.setCliente(new Cliente());
        Factura facturaGuardada = factRepo.save(factura);
        factRepo.delete(facturaGuardada);
        Factura facturaBuscada = factRepo.findById(facturaGuardada.getIdFactura()).orElse(null);
        System.out.println("----------> "+facturaBuscada);
        Assertions.assertNull(facturaBuscada);
    }
    @Test
    public void actualizarFactura(){
        Factura factura = new Factura();
        Cliente cliente = new Cliente();

        factura.setCliente(new Cliente());
        Factura facturaGuardada = factRepo.save(factura);
        cliente.setEmail("cliente@gmail.com");
        facturaGuardada.setCliente(cliente);

        Factura facturaActualizada = factRepo.save(facturaGuardada);
        Factura facturaActualizadaBuscada = factRepo.findById(facturaActualizada.getIdFactura()).orElse(null);
        Assertions.assertNotNull(facturaActualizadaBuscada);
    }
    @Test
    public void listarFacturasTest(){
        List<Factura> lista = factRepo.findAll();
        System.out.println(lista);
    }
}
