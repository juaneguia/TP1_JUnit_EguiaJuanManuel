package ejercicio1;

public abstract class Producto {

	protected double precio;
	protected String marca;
	protected int stock;
	
	public Producto(double precio, String marca, int stock) {
		this.precio = precio;
		this.marca = marca;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public int setStock(int stock) {
		if (stock<=0) {
			throw new IllegalArgumentException("El Stock no puede ser 0 ni negativo");
		}
		return this.stock = stock;
	}
	
	public abstract double calcularPrecioU();
	
	
}
