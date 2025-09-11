package ejercicio1;

public class Impresora extends Producto{

	private int velocidad;
	private boolean color;

	public Impresora(double precio, String marca, int stock, int velocidad, boolean color) {
		super(precio, marca, stock);
		this.velocidad = velocidad;
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public double calcularPrecioU() {
		if(color) {
			precio= getPrecio()*1.20;
		}
		else {
			precio = getPrecio();
		}
		return precio;
	}
}
