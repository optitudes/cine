package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Ciudad;
import co.edu.uniquindio.unicine.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CiudadRepo extends JpaRepository<Ciudad, Integer> {

    @Query("select  c from Ciudad c,Teatro b where c.nombre =?1 and b.nombre =?2 ")
    Ciudad obtenerCiudadTeatro(String nombreCiudad,String nombreTeatro);

    @Query("select  c from Ciudad c,Cliente b where c.nombre =?1 and b.nombreCompleto =?2 ")
    Ciudad obtenerCiudadCliente(String nombreCiudad,String nombreCliente);




}
