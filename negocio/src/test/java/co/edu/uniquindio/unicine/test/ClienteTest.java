package co.edu.uniquindio.unicine.test;



import co.edu.uniquindio.unicine.entidades.Cliente;
import co.edu.uniquindio.unicine.repo.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.jdbc.Sql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void regitrar(){

        String[] telefonos = new String[]{"12345", "67890"};
        Cliente cliente = new Cliente("Jhon", "jhon@gmail.com", "ruta", "1234", Arrays.asList(telefonos));

        Cliente clienteGuardado = clienteRepo.save(cliente);
        Assertions.assertEquals("Jhon", clienteGuardado.getNombreCompleto());
        System.out.println(clienteGuardado);


    }

    @Test
    @Sql("classpath:dataset.sql")
    public void eliminar(){

        Cliente buscado = clienteRepo.findById(1).orElse(null);
        clienteRepo.delete(buscado);


        Assertions.assertNull(clienteRepo.findById(1).orElse(null));
        System.out.println(buscado);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void actualizar(){

        Cliente clienteGuardado = clienteRepo.findById(4).orElse(null);
        clienteGuardado.setEmail("nuevo@gmail.com");

        Cliente nuevo = clienteRepo.save(clienteGuardado);
        Assertions.assertEquals("nuevo@gmail.com", nuevo.getEmail());
        System.out.println(nuevo);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void obtener(){

        Optional<Cliente> buscado = clienteRepo.findById(4);
        Assertions.assertNotNull(buscado.orElse(null));
        System.out.println(buscado);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){

        List<Cliente> lista = clienteRepo.findAll();
        lista.forEach(System.out::println);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void obtenerPorCorreo(){

        Cliente cliente = clienteRepo.findByEmail("luis@gmail.com");
        Assertions.assertNotNull(cliente);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void comprobobarAutenticacion(){

        Cliente cliente = clienteRepo.findByEmailAndContrasenia("luis@gmail.com", "1235");
        Assertions.assertNotNull(cliente);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void paginador(){

        List<Cliente> cliente = clienteRepo.findAll(PageRequest.of(0,3)).toList();
        cliente.forEach(System.out::println);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void paginadorEstado(){

        List<Cliente> cliente = clienteRepo.obtenerPorEstado(true, PageRequest.of(0,3));
        cliente.forEach(System.out::println);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void ordenarRegistros(){

        List<Cliente> cliente = clienteRepo.findAll( Sort.by("nombreCompleto"));
        cliente.forEach(System.out::println);

    }

}
