package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
    private Circulo c1;

    @BeforeEach
    public void beforeEach() {
       c1 = new Circulo(10.0);
    }

    @AfterEach
    public void afterEach() {
        c1 = null;
    }

    @Test
    public void presencaAtributos() {
        assertEquals(10.0, c1.getRaio());
    }

    @Test
    public void criarObjetoCirculo() {
        assertNotNull(c1);
    }


    @Test
    public void metodoGetRaio() {
        c1.setRaio(10.0);
        assertEquals(10.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaio() {
        c1.setRaio(20.0);
        assertEquals(20.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaioInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setRaio(-20.0));
        assertEquals("O raio deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Double valorEsperado = 314.0;
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Double valorEsperado = 20.0 * 3.14;
        Double valorObtido = c1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}



