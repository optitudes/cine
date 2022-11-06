package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.AdminTeatro;
import co.edu.uniquindio.unicine.repo.AdminTeatroRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AdminTeatroTest {
    @Autowired
    private AdminTeatroRepo adminTeatroRepo;

    @Test
    public void registrarAdmin() {
        AdminTeatro adminT = new AdminTeatro();

        adminT.setIdAdmin(1234);
        adminT.setContra("1234");
        adminT.setEmail("admin@admin.com");
        AdminTeatro adminGuardado = adminTeatroRepo.save(adminT);
        System.out.println("admin guardado "+adminGuardado);
        Assertions.assertNotNull(adminGuardado);
    }
    @Test
    public void eliminarAdmin() {
        AdminTeatro admin = new AdminTeatro();

        admin.setIdAdmin(1234);
        admin.setContra("1234");
        admin.setEmail("admin@admin.com");
        AdminTeatro adminGuardado = adminTeatroRepo.save(admin);
        adminTeatroRepo.delete(admin);
        AdminTeatro adminBuscado = adminTeatroRepo.findById(1234).orElse(null);
        System.out.println("----------> "+adminBuscado);
        Assertions.assertNull(adminBuscado);
    }
    @Test
    public void actualizarAdmin(){
        AdminTeatro admin = new AdminTeatro();

        admin.setIdAdmin(1234);
        admin.setContra("1234");
        admin.setEmail("admin@admin.com");

        AdminTeatro adminGuardado = adminTeatroRepo.save(admin);
        Assertions.assertNotNull(adminGuardado);
        admin.setEmail("admin@admincito.com");
        AdminTeatro adminActualizado = adminTeatroRepo.save(admin);
        AdminTeatro adminActualizadoBuscado = adminTeatroRepo.findById(1234).orElse(null);
        System.out.println("admin guardado"+adminGuardado);
        System.out.println("admin actualizado"+adminActualizado);
        System.out.println("admin buscado"+adminActualizadoBuscado);
        Assertions.assertNotNull(adminActualizadoBuscado);
    }
    @Test
    public void listarAdminsTest(){
        List<AdminTeatro> lista = adminTeatroRepo.findAll();
        System.out.println(lista);
    }

}
