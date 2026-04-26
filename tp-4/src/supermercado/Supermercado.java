package supermercado;

import java.util.ArrayList;

public class Supermercado {
	ArrayList<Producto> productos =  new ArrayList<>();
	String nombre;
	String direccion;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Double getPrecioTotal() {
		Double total = productos.stream()
				.mapToDouble(Producto::getPrecio)
				.sum();
		return total;
	}
}

