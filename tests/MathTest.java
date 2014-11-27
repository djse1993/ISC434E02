/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David Sanchez
 */
public class MathTest {
    
    public MathTest() {
    }
    
    @Test
    public void testPerimeterOfSquare()
    {
        Math mate = new Math();
        assertEquals(16, mate.perimeterOfSquare(4));
        assertEquals(4, mate.perimeterOfSquare(1));
        assertEquals(400, mate.perimeterOfSquare(100));
        assertEquals(60,mate.perimeterOfSquare(15));
        assertEquals(20, mate.perimeterOfSquare(5));
        assertEquals(120, mate.perimeterOfSquare(30));
        assertEquals(300, mate.perimeterOfSquare(75));
        assertEquals(32000, mate.perimeterOfSquare(8000));
        assertEquals(800, mate.perimeterOfSquare(200));
    }
    
    @Test 
    public void testtwoSumsOfN()
    {
        Math mate = new Math();
        assertEquals(2, mate.twoSumsOfN(5, 1, 5));
        assertEquals(5, mate.twoSumsOfN(10, 1, 10));
        assertEquals(50, mate.twoSumsOfN(100, 1, 100));
        assertEquals(2, mate.twoSumsOfN(3, 0, 3));
    }
    
    @Test
    public void testEvenDivide(){
        Math te = new Math();
        assertEquals(true, te.evenDivide(20));
        assertEquals(true, te.evenDivide(24));
        assertEquals(true, te.evenDivide(8));
        assertEquals(true, te.evenDivide(4));
        assertEquals(true, te.evenDivide(400));
        assertEquals(true, te.evenDivide(76));
        assertEquals(false, te.evenDivide(2));
        assertEquals(false, te.evenDivide(18));
        assertEquals(false, te.evenDivide(5));
        assertEquals(false, te.evenDivide(17));
        assertEquals(false, te.evenDivide(23));
        assertEquals(false, te.evenDivide(11));
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
