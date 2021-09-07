
package reproducir;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ReproduccionTest {
    Reproduccion cancion;
    
    public ReproduccionTest() {
        
    }
    
    @Before
    public void setUp() {
        cancion = new Reproduccion();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        assertFalse(cancion.isPlaying());
        cancion.play();
        assertTrue(cancion.isPlaying());
        cancion.pause();
        assertEquals(cancion.song, 1, 0.1);
        
        
    }
/*
    @Test
    public void testPause() {
        System.out.println("pause");
        Reproduccion instance = new Reproduccion();
        instance.pause();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStop() {
        System.out.println("stop");
        Reproduccion instance = new Reproduccion();
        instance.stop();
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsPlaying() {
        System.out.println("isPlaying");
        Reproduccion instance = new Reproduccion();
        boolean expResult = false;
        boolean result = instance.isPlaying();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }*/
    
}
