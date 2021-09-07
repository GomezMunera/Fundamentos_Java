
import calculadora.Calcula;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCalcula {
    
    public TestCalcula() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCuadradoPositivo() {
        Calcula calc = new Calcula();
        assertEquals(25.0, calc.cuadrado(5.0), 0.000000001);
    }
    
    @Test
    public void testCuadradoCero() {
        Calcula calc = new Calcula();
        assertEquals(0.0, calc.cuadrado(0.0), 0.000000001);
    }

    @Test
    public void testCuadradoUno() {
        Calcula calc = new Calcula();
        assertEquals(1.0, calc.cuadrado(1.0), 0.000000001);
    }

    @Test
    public void testCuadradoNegativo() {
        Calcula calc = new Calcula();
        assertEquals(16.0, calc.cuadrado(-4.0), 0.000000001);
    }

    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calcula calc = new Calcula();
        assertEquals(125.0, calc.cubo(5.0), 0.000000001);
    }

    @Test
    public void testCuboCero() {
        Calcula calc = new Calcula();
        assertEquals(0.0, calc.cubo(0.0), 0.000000001);
    }

    @Test
    public void testCuboUno() {
        Calcula calc = new Calcula();
        assertEquals(1.0, calc.cubo(1.0), 0.000000001);
    }

    @Test
    public void testCuboMenosUno() {
        Calcula calc = new Calcula();
        assertEquals(-1.0, calc.cubo(-1.0), 0.000000001);
    }

    @Test
    public void testCuboNegativo() {
        Calcula calc = new Calcula();
        assertEquals(-64.0, calc.cubo(-4.0), 0.000000001);
    }
    
}
