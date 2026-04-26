package trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	List<Ingreso> ingresos = new ArrayList<>(); 
	
	public Trabajador()	{}
	
	public Trabajador(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public double getTotalPercibido() {
		double total = ingresos.stream()
				.mapToDouble(Ingreso::getMonto)
				.sum();
		return total;
	}
	
	public double getMontoImponible() {
		double total = ingresos.stream()
				.mapToDouble(Ingreso::getMontoImponible)
				.sum();
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
}
