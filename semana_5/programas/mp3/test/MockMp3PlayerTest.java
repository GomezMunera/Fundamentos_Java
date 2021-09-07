/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
//import static junit.framework.TestCase.assertEquals;
//import static junit.framework.TestCase.assertFalse;
//import static junit.framework.TestCase.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MockMp3PlayerTest {
    protected Mp3Player mp3;
    protected ArrayList list = new ArrayList();
    
    public MockMp3PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mp3 = new MockMp3Player();
        list = new ArrayList();
        list.add("Bill Chase -- Open Up Wide");
        list.add("Jethro Tull -- Locomotive Breath");
        list.add("The Boomtown Rats -- Monday");
        list.add("Carl Orff -- O Fortuna");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class MockMp3Player.
     */
    @Test
    public void testPlay() {
        mp3.loadSongs(list);
        assertFalse(mp3.isPlaying());
        mp3.play();
        assertTrue(mp3.isPlaying());
        assertTrue(mp3.currentPosition() != 0.0);
        mp3.pause();
        assertTrue(mp3.currentPosition() != 0.0);
        mp3.stop();
        assertEquals(mp3.currentPosition(), 0.0, 0.1);
    }
    
    

    /**
     * Test of pause method, of class MockMp3Player.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        /*MockMp3Player instance = new MockMp3Player();
        instance.pause();*/
        
        assertFalse(mp3.isPlaying());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class MockMp3Player.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        /*MockMp3Player instance = new MockMp3Player();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        assertEquals(false, mp3.isPlaying());
    }

    /**
     * Test of currentPosition method, of class MockMp3Player.
     */
    @Test
    public void testCurrentPosition() {
        System.out.println("currentPosition");
        MockMp3Player instance = new MockMp3Player();
        double expResult = 0.0;
        double result = instance.currentPosition();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of currentSong method, of class MockMp3Player.
     */
    @Test
    public void testCurrentSong() {
        System.out.println("currentSong");
        MockMp3Player instance = new MockMp3Player();
        String expResult = null;
        String result = instance.currentSong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class MockMp3Player.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        MockMp3Player instance = new MockMp3Player();
        instance.next();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of prev method, of class MockMp3Player.
     */
    @Test
    public void testPrev() {
        System.out.println("prev");
        MockMp3Player instance = new MockMp3Player();
        instance.prev();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isPlaying method, of class MockMp3Player.
     */
    @Test
    public void testIsPlaying() {
        System.out.println("isPlaying");
        MockMp3Player instance = new MockMp3Player();
        boolean expResult = false;
        boolean result = instance.isPlaying();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loadSongs method, of class MockMp3Player.
     */
    @Test
    public void testLoadSongs() {
        System.out.println("loadSongs");
        ArrayList names = null;
        MockMp3Player instance = new MockMp3Player();
        instance.loadSongs(names);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testPlayNoList() {
        // Don’t set the list up
        assertFalse(mp3.isPlaying());
        mp3.play();
        assertFalse(mp3.isPlaying());
        assertEquals(mp3.currentPosition(), 0.0, 0.1);
        mp3.pause();
        assertEquals(mp3.currentPosition(), 0.0, 0.1);
        assertFalse(mp3.isPlaying());
        mp3.stop();
        assertEquals(mp3.currentPosition(), 0.0, 0.1);
        assertFalse(mp3.isPlaying());
    }
    
}
