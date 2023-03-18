import org.junit.jupiter.api.Test;
import RaizCuadrada.RaizCuadrada;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaizCuadradaTest {
    @Test
    public void raizCuadradaTest() {
        RaizCuadrada raizCuadrada = new RaizCuadrada();
        double resultado = raizCuadrada.raizCuadrada(9);
        assertEquals(3, resultado);
        assertEquals(0, raizCuadrada.raizCuadrada(0));
        assertEquals("La raíz cuadrada no está definida para un número negativo", raizCuadrada.raizCuadrada(-3));
    }
}
