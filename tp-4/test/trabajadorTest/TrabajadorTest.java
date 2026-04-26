package trabajadorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import trabajador.Trabajador;
import trabajador.Ingreso;
import trabajador.IngresoPorHorasExtras;

public class TrabajadorTest {

    private Trabajador trabajador;

    @BeforeEach
    public void setUp() {
        trabajador = new Trabajador();

        trabajador.agregarIngreso(new Ingreso(1, "Sueldo", 1000));
        trabajador.agregarIngreso(new Ingreso(1, "Bono", 500));
        trabajador.agregarIngreso(new IngresoPorHorasExtras(1, "Horas extra", 200, 10));
    }

    @Test
    public void testTotalPercibido() {
        assertEquals(1700, trabajador.getTotalPercibido(), 0.01);
    }

    @Test
    public void testMontoImponible() {
        assertEquals(1500, trabajador.getMontoImponible(), 0.01);
    }

    @Test
    public void testImpuestoAPagar() {
        assertEquals(30, trabajador.getImpuestoAPagar(), 0.01);
    }
}