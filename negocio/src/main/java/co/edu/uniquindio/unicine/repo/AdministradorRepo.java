package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Administrator;
import co.edu.uniquindio.unicine.entidades.Cliente;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepo extends JpaRepository<Administrator, Integer>
{

    @Query("select c from Cliente c where c.email = :email and c.contrasenia = :contra")
    Administrator comprobarAutenticacion(String email, String contra);

    Administrator findByEmailAndContra(String email, String contra);


}
