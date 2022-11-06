package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Confiteria;
import co.edu.uniquindio.unicine.entidades.Confiteria_Cliente;
import co.edu.uniquindio.unicine.entidades.Factura;
import co.edu.uniquindio.unicine.repo.Confiteria_clienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Confiteria_ClienteTest {
    @Autowired
    private Confiteria_clienteRepo confiCRepo;
    @Test
    public void registrarConfiteriaC() {
        Confiteria_Cliente confiC = new Confiteria_Cliente();

        confiC.setConfiteria(new Confiteria());
        confiC.setPrecio(55000);
        confiC.setFactura(new Factura());

        Confiteria_Cliente confiCGuardada = confiCRepo.save(confiC);
        Assertions.assertNotNull(confiCGuardada);
    }
    @Test
    public void eliminarConfiteriaC() {
        Confiteria_Cliente confiC = new Confiteria_Cliente();

        confiC.setConfiteria(new Confiteria());
        confiC.setPrecio(55000);
        confiC.setFactura(new Factura());

        Confiteria_Cliente confiCGuardada = confiCRepo.save(confiC);
        confiCRepo.delete(confiCGuardada);
        Confiteria_Cliente confiCBuscada = confiCRepo.findById(confiCGuardada.getIdConfi_Cli()).orElse(null);
        System.out.println("----------> "+confiCGuardada);
        Assertions.assertNull(confiCBuscada);
    }
    @Test
    public void actualizarConfiC(){
        Confiteria_Cliente confiC = new Confiteria_Cliente();

        confiC.setConfiteria(new Confiteria());
        confiC.setPrecio(55000);
        confiC.setFactura(new Factura());

        Confiteria_Cliente confiCGuardada = confiCRepo.save(confiC);
        confiCGuardada.setPrecio(1000);
        Confiteria_Cliente confiCActualizada = confiCRepo.save(confiCGuardada);
        Confiteria_Cliente confiCActualizadaBuscada = confiCRepo.findById(confiCActualizada.getIdConfi_Cli()).orElse(null);
        Assertions.assertNotNull(confiCActualizadaBuscada);
    }
    @Test
    public void listarConfiCTest(){
        List<Confiteria_Cliente> lista = confiCRepo.findAll();
        System.out.println(lista);
    }
}
