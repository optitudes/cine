package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Cliente_Merchandising;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clinete_MechandsingRepo extends JpaRepository<Cliente_Merchandising, Integer> {
}
