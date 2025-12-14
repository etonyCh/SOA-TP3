package tn.fss.lsi3.soa.tp3;

import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculRestTest {

    private final CalculRest calculRest = new CalculRest();

    @Test
    void testSomme() {
        Operation result = calculRest.somme(10, 5);
        assertEquals(15.0, result.getResult());
        assertEquals("ADDITION", result.getType());
    }

    @Test
    void testSoustraction() {
        Operation result = calculRest.soustraction(10, 5);
        assertEquals(5.0, result.getResult());
        assertEquals("SOUSTRACTION", result.getType());
    }

    @Test
    void testMultiplication() {
        Operation result = calculRest.multiplication(10, 5);
        assertEquals(50.0, result.getResult());
        assertEquals("MULTIPLICATION", result.getType());
    }

    @Test
    void testDivision() {
        Response response = calculRest.division(10, 5);
        assertEquals(200, response.getStatus());
        Operation op = (Operation) response.getEntity();
        assertEquals(2.0, op.getResult());
        assertEquals("DIVISION", op.getType());
    }

    @Test
    void testDivisionByZero() {
        Response response = calculRest.division(10, 0);
        assertEquals(400, response.getStatus());
        assertEquals("Division par zéro impossible", response.getEntity());
    }
}
