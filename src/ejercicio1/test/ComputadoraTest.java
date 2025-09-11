package ejercicio1.test;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ejercicio1.Computadora;

class ComputadoraTest {
	
	@Test
	public void calcularPrecioUTest() {
		Computadora c1 = new Computadora(1000, "hp", 10, "dsmsmd", 16, 512, false);
		
		double resultado = c1.calcularPrecioU();
		assertNotEquals(19519, resultado); 
	} 
	
	@Test
	@Disabled ("Test no realizado")
	public void setRamTest() {
		Computadora c2 = new Computadora(1000, "hp", 10, "dsmsmd", 16, 512, false);
		
		int nuevaRam = c2.setRam(32);
		assertEquals(32, nuevaRam); 
	}
	
	@Test
	public void setAlmTest() {
	    Computadora c3 = new Computadora(1000, "hp", 10, "dsmsmd", 16, 512, false);

	    assertThrows(NullPointerException.class, () -> {
	        c3.setAlmacenamiento((Integer) null);
	    });
	}
}