package graub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class LivroTest {

	 private Livro livro;

	    @Before
	    public void setUp() {
	        livro = new Livro("Harry Potter", 29.99f, 1, 10, "J.K. Rowling", "Bloomsbury Publishing");
	    }

	    @Test
	    public void testGetAutor() {
	        String autor = livro.getAutor();
	        Assert.assertEquals("J.K. Rowling", autor);
	    }

	    @Test
	    public void testSetAutor() {
	        livro.setAutor("John Doe");
	        String autor = livro.getAutor();
	        Assert.assertEquals("John Doe", autor);
	    }

	    @Test
	    public void testGetEditora() {
	        String editora = livro.getEditora();
	        Assert.assertEquals("Bloomsbury Publishing", editora);
	    }

	    @Test
	    public void testSetEditora() {
	        livro.setEditora("Random House");
	        String editora = livro.getEditora();
	        Assert.assertEquals("Random House", editora);
	    }

	    @Test
	    public void testToString() {
	        String expected = "LIVRO -- quantidade = 10, ID= 1, título = Harry Potter, autor = J.K. Rowling, editora = Bloomsbury Publishing, preco = R$29.99\n";
	        String result = livro.toString();
	        Assert.assertEquals(expected, result);
	    }

}
