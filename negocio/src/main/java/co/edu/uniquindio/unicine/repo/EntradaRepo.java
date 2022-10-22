package co.edu.uniquindio.unicine.repo;
import co.edu.uniquindio.unicine.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EntradaRepo extends JpaRepository<Entrada, Integer>{
}
