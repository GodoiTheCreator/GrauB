package graub;

import static org.junit.Assert.*;

import org.junit.Test;

public class EletronicosTest {

	 @Test
	    public void testGetMarca() {
	        Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");
	        String marca = eletronicos.getMarca();
	        assertEquals("Apple", marca);
	    }
	    
	    @Test
	    public void testGetMarcaDifferent() {
	        Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Samsung", "Celular");
	        String marca = eletronicos.getMarca();
	        assertEquals("Samsung", marca);
	    }
	    @Test
	    public void testSetMarca() {
	        Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");
	        eletronicos.setMarca("Samsung");
	        String marca = eletronicos.getMarca();
	        assertEquals("Samsung", marca);
	    }
	    
	    @Test
	    public void testSetMarcaDifferent() {
	        Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");
	        eletronicos.setMarca("Sony");
	        String marca = eletronicos.getMarca();
	        assertEquals("Sony", marca);
	    }
	    @Test
	    public void testGetTipo() {
	        Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");
	        String tipo = eletronicos.getTipo();
	        assertEquals("Celular", tipo);
	    }
	    
	    @Test
	    public void testGetTipoDifferent() {
	        Eletronicos eletronicos = new Eletronicos("Smartwatch", 500.0f, 5, 2, "Samsung", "Smartwatch");
	        String tipo = eletronicos.getTipo();
	        assertEquals("Smartwatch", tipo);
	    }
	    @Test
	    public void testSetTipo() {
	        Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");
	        eletronicos.setTipo("Tablet");
	        String tipo = eletronicos.getTipo();
	        assertEquals("Tablet", tipo);
	    }
	    
	    @Test
	    public void testSetTipoDifferent() {
	        Eletronicos eletronicos = new Eletronicos("Smartwatch", 500.0f, 5, 2, "Samsung", "Smartwatch");
	        eletronicos.setTipo("Fone de Ouvido");
	        String tipo = eletronicos.getTipo();
	        assertEquals("Fone de Ouvido", tipo);
	    }
	   

	        @Test
	        public void testConstructor() {
	            Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");

	            assertEquals("Smartphone", eletronicos.getNome());
	            assertEquals(1000.0f, eletronicos.getPreco(), 0.001);
	            assertEquals(10, eletronicos.getQuantidade());
	            assertEquals(1, eletronicos.getId());
	            assertEquals("Apple", eletronicos.getMarca());
	            assertEquals("Celular", eletronicos.getTipo());
	        }
	        @Test
	        public void testToString() {
	            Eletronicos eletronicos = new Eletronicos("Smartphone", 1000.0f, 10, 1, "Apple", "Celular");

	            String expectedToString = "ELETRONICO -- quantidade = 10, ID = 1, marca = Apple, tipo=Celular, nome=Smartphone, preco = R$1000.0\n";
	            String actualToString = eletronicos.toString();

	            assertEquals(expectedToString, actualToString);
	        }
}
