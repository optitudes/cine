package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Administrator;
import co.edu.uniquindio.unicine.entidades.Ciudad;
import co.edu.uniquindio.unicine.repo.AdministradorRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AdministratorTest {
    @Autowired
    private AdministradorRepo adminRepo;

    @Test
    public void registrarAdmin() {
        Administrator admin = new Administrator();

        admin.setIdAdmin(1234);
        admin.setContra(1234);
        admin.setEmail("admin@admin.com");
        Administrator adminGuardado = adminRepo.save(admin);
        Assertions.assertNotNull(admin);
    }
    @Test
    public void eliminarAdmin() {
        Administrator admin = new Administrator();

        admin.setIdAdmin(1234);
        admin.setContra(1234);
        admin.setEmail("admin@admin.com");
        Administrator adminGuardado = adminRepo.save(admin);
        adminRepo.delete(admin);
        Administrator adminBuscado = adminRepo.findById(1234).orElse(null);
        System.out.println("----------> "+adminBuscado);
        Assertions.assertNull(adminBuscado);
    }
    @Test
    public void actualizarAdmin(){
        Administrator admin = new Administrator();
        Administrator admin2 = new Administrator();

        admin.setIdAdmin(1234);
        admin.setContra(1234);
        admin.setEmail("admin@admin.com");

        admin2.setIdAdmin(3455);
        admin2.setContra(3455);
        admin2.setEmail("dmin@admin.com");

        Administrator adminGuardado = adminRepo.save(admin);
        Administrator adminGuardado2 = adminRepo.save(admin2);
        Assertions.assertNotNull(adminGuardado);
        admin.setEmail("admin@admincito.com");
        Administrator adminActualizado = adminRepo.save(admin);
        Administrator adminActualizadoBuscado = adminRepo.findById(1234).orElse(null);
        System.out.println("admin guardado"+adminGuardado);
        System.out.println("admin guardado2"+adminGuardado2);
        System.out.println("admin actualizado"+adminActualizado);
        System.out.println("admin buscado"+adminActualizadoBuscado);
        Assertions.assertNotNull(adminActualizadoBuscado);
    }
    @Test
    public void listarAdminsTest(){
        List<Administrator> lista = adminRepo.findAll();
        System.out.println(lista);
    }

}
