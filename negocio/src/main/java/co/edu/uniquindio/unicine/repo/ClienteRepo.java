package co.edu.uniquindio.unicine.repo;


import co.edu.uniquindio.unicine.entidades.Cliente;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

    @Query("select  c from Cliente c where c.email =?1")
    Cliente obtener(String email);

    Cliente findByEmail(String email);

    @Query("select c from Cliente c where c.email = :email and c.contrasenia = :contrasenia")
    Cliente comprobarAutenticacion(String email, String contrasenia);

    Cliente findByEmailAndContrasenia(String email, String contrasenia);

    @Query("select c from Cliente c where c.estado = :estado")
    List<Cliente> obtenerPorEstado(boolean estado, Pageable paginador);

    
}
