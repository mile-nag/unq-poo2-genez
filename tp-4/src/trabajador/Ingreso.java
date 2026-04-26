package trabajador;


public class Ingreso {
	int mes;
	String concepto;
	double monto;
	
	public Ingreso(int mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public double getMontoImponible() {
		return monto;
	}
	
}
