package graub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EletrodomesticosTest {

	private Eletrodomesticos eletrodomesticos;

    @BeforeEach
    public void setUp() {
        eletrodomesticos = new Eletrodomesticos("Geladeira", 1500.0f, 1, 5, "Electrolux", "Branco", "220V");
    }

    @Test
    public void testGetMarca() {
        String marca = eletrodomesticos.getMarca();
        Assertions.assertEquals("Electrolux", marca);
    }

    @Test
    public void testSetMarca() {
        eletrodomesticos.setMarca("Brastemp");
        String marca = eletrodomesticos.getMarca();
        Assertions.assertEquals("Brastemp", marca);
    }

    @Test
    public void testGetCor() {
        String cor = eletrodomesticos.getCor();
        Assertions.assertEquals("Branco", cor);
    }

    @Test
    public void testSetCor() {
        eletrodomesticos.setCor("Prata");
        String cor = eletrodomesticos.getCor();
        Assertions.assertEquals("Prata", cor);
    }

    @Test
    public void testGetTensao() {
        String tensao = eletrodomesticos.getTensao();
        Assertions.assertEquals("220V", tensao);
    }

    @Test
    public void testSetTensao() {
        eletrodomesticos.setTensao("110V");
        String tensao = eletrodomesticos.getTensao();
        Assertions.assertEquals("110V", tensao);
    }

    @Test
    public void testToString() {
        String expected = "ELETRODOMESTICOS -- quantidade = 5, ID = 1, marca = Electrolux, cor = Branco, tensao = 220V, nome = Geladeira, preco = R$1500.0\n";
        String actual = eletrodomesticos.toString();
        Assertions.assertEquals(expected, actual);
    }
}
