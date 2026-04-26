package trabajadorTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import trabajador.Trabajador;
import trabajador.Ingreso;
import trabajador.IngresoPorHorasExtras;

public class IngresoTest {

    @Test
    public void testCalculoDeIngresos() {
        // Arrange
        Ingreso sueldo = new Ingreso(4, "Sueldo", 1000);
        Ingreso bono = new Ingreso(4, "Bono", 500);
        Ingreso horasExtras = new IngresoPorHorasExtras(4, "Horas extra", 200, 10);

        Trabajador trabajador = new Trabajador(List.of(sueldo, bono, horasExtras));

        // Act
        double totalPercibido = trabajador.getTotalPercibido();
        double totalImponible = trabajador.getMontoImponible();

        // Assert
        assertEquals(1700, totalPercibido, 0.001);
        assertEquals(1500, totalImponible, 0.001);
    }
}
