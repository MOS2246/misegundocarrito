package ap.utn.grupo6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarritoTest {

	//Cant. de productos carrito vacio
	@Test
	public void testCantProdVacio() {
		Persona persona1 = new Persona("Mariana", "Gonzalez");
		Carrito c1 = new Carrito(persona1);
		
		assertEquals(0, c1.cantProds());
	}
	@Test
	public void testCosto2Productos() {
		Persona persona1 = new Persona("Mariana", "Gonzalez");
		
		Producto producto1 = new Producto("Cepillo de dientes");
		producto1.setPrecio(550.0);
		
		Producto producto2 = new Producto("Pasta dental");
		producto2.setPrecio(750.0);
		
		Carrito c1 = new Carrito(persona1);
		c1.setProducto1(producto1);
		c1.setProducto2(producto2);
		
		assertEquals(1300.0, c1.costoFinal(), 0.001);
	}
}
