package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach() {
        r1 = new Retangulo(10.0,10.0);
    }

    @AfterEach
    public void afterEach() {
        r1 = null;
    }

    @Test
    public void criarObjetoRetangulo() {
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase() {
        assertEquals(10.0, r1.getBase());
    }

    @Test
    public void presencaAtributoAltura() {
        assertEquals(10.0, r1.getAltura());
    }

    @Test
    public void metodoGetBase() {
        assertEquals(10.0, r1.getBase());
    }

    @Test
    public void metodoSetBase() {
        r1.setBase(20.0);
        assertEquals(20.0, r1.getBase());
    }

    @Test
    public void metodoSetBaseInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setBase(-20.0));
        assertEquals("A base deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoGetAltura() {
        assertEquals(10.0, r1.getAltura());
    }

    @Test
    public void metodoSetAltura() {
        r1.setAltura(20.0);
        assertEquals(20.0, r1.getAltura());
    }

    @Test
    public void metodoSetAlturaInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(-20.0));
        assertEquals("A altura deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Double valorEsperado = 100.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Double valorEsperado = 40.0;
        Double valorObtido = r1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}

