package co.edu.uniquindio.unicine.test;



import co.edu.uniquindio.unicine.entidades.Cliente;
import co.edu.uniquindio.unicine.repo.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void regitrar(){

        String[] telefonos = new String[]{"12345", "67890"};
        Cliente cliente = new Cliente("Jhon", "jhon@gmail.com", "ruta", "1234", Arrays.asList(telefonos));

        Cliente clienteGuardado = clienteRepo.save(cliente);
        Assertions.assertEquals("Jhon", clienteGuardado.getNombreCompleto());

    }

    @Test
    public void eliminar(){

        String[] telefonos = new String[]{"12345", "67890"};
        Cliente cliente = new Cliente("Jhon", "jhon@gmail.com", "ruta", "1234", Arrays.asList(telefonos));
        cliente.setCedula(1);

        Cliente clienteGuardado = clienteRepo.save(cliente);
        clienteRepo.delete(cliente);

        Optional<Cliente> buscado = clienteRepo.findById(1);
        Assertions.assertNull(buscado.orElse(null));
    }

    @Test
    public void actualizar(){

        String[] telefonos = new String[]{"12345", "67890"};
        Cliente cliente = new Cliente("Jhon", "jhon@gmail.com", "ruta", "1234", Arrays.asList(telefonos));
        cliente.setCedula(1);

        Cliente clienteGuardado = clienteRepo.save(cliente);
        clienteGuardado.setEmail("Jhon_nuevo@gmail.com");

        Cliente nuevo = clienteRepo.save(clienteGuardado);
        Assertions.assertEquals("Jhon_nuevo@gmail.com", nuevo.getEmail());

    }

    @Test
    public void obtener(){

        String[] telefonos = new String[]{"12345", "67890"};
        Cliente cliente = new Cliente("Jhon", "jhon@gmail.com", "ruta", "1234", Arrays.asList(telefonos));
        cliente.setCedula(1);

        clienteRepo.save(cliente);

        Optional<Cliente> buscado = clienteRepo.findById(1);
        System.out.println(buscado.orElse(null));


    }

    @Test
    public void listar(){

        String[] telefonos = new String[]{"12345", "67890"};
        Cliente cliente = new Cliente("Jhon", "jhon@gmail.com", "ruta", "1234", Arrays.asList(telefonos));
        cliente.setCedula(1);

        clienteRepo.save(cliente);

        List<Cliente> lista = clienteRepo.findAll();
        System.out.println(lista);

    }

}
