package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Entrada;
import co.edu.uniquindio.unicine.entidades.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaRepo extends JpaRepository<Tarjeta, Integer> {
}
