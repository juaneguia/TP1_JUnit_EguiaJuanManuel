package ejercicio1;

public class Computadora extends Producto{

	private String modelo;
	private int ram;
	private int almacenamiento;
	private boolean rgb;
	
	public Computadora(double precio, String marca, int stock, String modelo, int ram, int almacenamiento,
			boolean rgb) {
		super(precio, marca, stock);
		this.modelo = modelo;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.rgb = rgb;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRam() {
		return ram;
	}

	public int setRam(int ram) {
		return this.ram = ram;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public int setAlmacenamiento(int almacenamiento) {
		return this.almacenamiento = almacenamiento;
	}

	public boolean isRgb() {
		return rgb;
	}

	public void setRgb(boolean rgb) {
		this.rgb = rgb;
	}

	@Override
	public double calcularPrecioU() {
		if(rgb) {
			precio= getPrecio()+(getPrecio()*0.1);
		}
		else {
			precio = getPrecio();
		}
		return precio;
	}
	
}
