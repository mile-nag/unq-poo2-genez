package supermercado;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.esPrecioCuidado = esPrecioCuidado;
		this.precio = precio;
	}
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.esPrecioCuidado = false;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double aumento) {
		this.precio += aumento;
	}
}
