package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Horario;
import co.edu.uniquindio.unicine.repo.HorarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalTime;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HorarioTest {
    @Autowired
    private HorarioRepo horarioR;
    @Test
    public void registrarHorario() {
        Horario horario = new Horario();

        Horario horarioGuardado = horarioR.save(horario);
        Assertions.assertNotNull(horarioGuardado);
    }
    @Test
    public void eliminarFuncion() {
        Horario horario = new Horario();

        Horario horarioGuardado = horarioR.save(horario);
        horarioR.delete(horarioGuardado);
        Horario horarioBuscado = horarioR.findById(horarioGuardado.getIdHora()).orElse(null);
        System.out.println("----------> "+horarioBuscado);
        Assertions.assertNull(horarioBuscado);
    }
    @Test
    public void actualizarFuncion(){
        Horario horario = new Horario();

        Horario horarioGuardado = horarioR.save(horario);

        System.out.println("horario guardado ->"+horarioGuardado.toString());
        horarioGuardado.setHora(LocalTime.now());

        Horario horarioActualizado = horarioR.save(horarioGuardado);
        Horario horarioActualizadoBuscada = horarioR.findById(horarioActualizado.getIdHora()).orElse(null);
        System.out.println("horario acturalizado ->"+horarioActualizadoBuscada.toString());
        Assertions.assertNotNull(horarioActualizadoBuscada);
    }
    @Test
    public void listarFunciones(){
        List<Horario> lista = horarioR.findAll();
        System.out.println("list of horarios "+lista.toString());
    }
}
