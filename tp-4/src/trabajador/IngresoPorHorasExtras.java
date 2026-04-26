package trabajador;

public class IngresoPorHorasExtras extends Ingreso {
	public IngresoPorHorasExtras(int mes, String concepto, double monto, int horas) {
		super(mes, concepto, monto);
		this.cantidadDeHoras = horas;
	}

	int cantidadDeHoras;
	
	@Override
	public double getMontoImponible() {
		return 0;
	}
}
