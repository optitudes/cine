package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.Horario;
import co.edu.uniquindio.unicine.entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepo extends JpaRepository<Pelicula, Integer> {

    @Query("select  c from Pelicula c ,Entrada b where c.idPelicula =?1 and b.idEntrada=?2 ")
    Pelicula obtenerPeliculaEntrada(int pelicula, int entrada);

    @Query("select  c from Pelicula c where c.idPelicula =?1 ")
    Pelicula  obtenerPelicula (int pelicula);


}
