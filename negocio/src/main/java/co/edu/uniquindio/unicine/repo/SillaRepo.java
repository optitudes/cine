package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Entrada;
import co.edu.uniquindio.unicine.entidades.Pelicula;
import co.edu.uniquindio.unicine.entidades.Silla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SillaRepo extends JpaRepository<Silla, Integer> {
    @Query("select  c from Silla c ,Cliente b where c.idSilla =?1 and b.cedula=?2 ")
    Silla obtenerSillaCliente(int silla, int cedula);

    @Query("select  c from  Silla c where c.idSilla =?1 ")
    Silla  obtenerSilla (int silla);
}
