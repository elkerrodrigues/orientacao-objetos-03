package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista c1;

    @BeforeEach
    public void beforeEach() {
        c1 = new Correntista("1234","Antonio","ant@email.com","40028922");
    }

    @AfterEach
    public void afterEach() {
        c1 = null;
    }

    @Test
    public void criarObjetoCorrentista() {
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoCodigo() {
        assertEquals("1234", c1.getCodigo());
    }
    @Test
    public void presencaAtributoNome() {
        assertEquals("Antonio", c1.getNome());
    }
    @Test
    public void presencaAtributoEmail() {
        assertEquals("ant@email.com", c1.getEmail());
    }
    @Test
    public void presencaAtributoTelefone() {
        assertEquals("40028922", c1.getTelefone());
    }
    @Test
    public void metodoGetCodigo() {
        assertEquals("1234", c1.getCodigo());
    }

    @Test
    public void metodoSetCodigo() {
        c1.setCodigo("1235");
        assertEquals("1235", c1.getCodigo());
    }

    @Test
    public void metodoSetCodigoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setCodigo("234"));
        assertEquals("Codigo Invalido.", exception.getMessage());
    }

    @Test
    public void metodoGetNome() {
        assertEquals("Antonio", c1.getNome());
    }

    @Test
    public void metodoSetNome() {
        c1.setNome("Pedro");
        assertEquals("Pedro", c1.getNome());
    }

    @Test
    public void metodoSetNomeInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setNome("A"));
        assertEquals("Nome Invalido.", exception.getMessage());
    }

    @Test
    public void metodoGetEmail() {
        assertEquals("ant@email.com", c1.getEmail());
    }

    @Test
    public void metodoSetEmail() {
        c1.setEmail("antonio@fmail.com");
        assertEquals("antonio@fmail.com", c1.getEmail());
    }

    @Test
    public void metodoSetEmailInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setEmail("ant"));
        assertEquals("Email Invalido.", exception.getMessage());
    }

    @Test
    public void metodoGetTelefone() {
        assertEquals("40028922", c1.getTelefone());
    }

    @Test
    public void metodoSetTelefone() {
        c1.setTelefone("22982004");
        assertEquals("22982004", c1.getTelefone());
    }

    @Test
    public void metodoSetTelefoneInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setTelefone("234"));
        assertEquals("Telefone Invalido.", exception.getMessage());
    }


}
