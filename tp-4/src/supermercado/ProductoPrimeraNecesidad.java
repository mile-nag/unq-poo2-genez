package supermercado;


public class ProductoPrimeraNecesidad extends Producto{
	
	Double porcentaje;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double porcentaje) {
		super(nombre, precio, esPrecioCuidado);
		this.porcentaje = porcentaje;
		
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Double porcentaje) {
		super(nombre, precio);
		this.porcentaje = porcentaje;
		
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * this.porcentaje) / 100;
	}
	
	
}
