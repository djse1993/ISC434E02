/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David Sanchez
 */
public class TimeTest {
    
    public TimeTest() {
    }
    
    @Test
    public void Testearlier()
    {
        Time tiempo = new Time();
        ArrayList<Integer> t1 = new ArrayList<Integer>();
        ArrayList<Integer> t2 = new ArrayList<Integer>();
        t1.add(4);t1.add(50);
        t2.add(2);t2.add(30);
        assertEquals(false, tiempo.earlier(t1,t2));
        t1.clear();t2.clear(); //BORRANDOLOS ARRAYS
        
        t1.add(3);t1.add(10);
        t2.add(6);t2.add(30);
        assertEquals(true, tiempo.earlier(t1,t2));
        t1.clear();t2.clear(); //BORRANDOLOS ARRAYS
        
        t1.add(3);t1.add(30);
        t2.add(3);t2.add(30);
        assertEquals(false, tiempo.earlier(t1,t2));
        t1.clear();t2.clear(); //BORRANDOLOS ARRAYS
        
        t1.add(4);t1.add(40);
        t2.add(4);t2.add(20);
        assertEquals(false, tiempo.earlier(t1,t2));
        t1.clear();t2.clear(); //BORRANDOLOS ARRAYS
        
        t1.add(4);t1.add(20);
        t2.add(4);t2.add(50);
        assertEquals(true, tiempo.earlier(t1,t2));
        t1.clear();t2.clear(); //BORRANDOLOS ARRAYS
        
        t1.add(2);t1.add(50);
        t2.add(3);t2.add(50);
        assertEquals(true, tiempo.earlier(t1,t2));
        t1.clear();t2.clear(); //BORRANDOLOS ARRAYS
        
        
        
     //   assertEquals(false, tiempo.earlier(new ArrayList<int>[]{4,50}, null));
    }
    
    @Test
    public void testNextSecond()
    {
        Time tiempo = new Time();
        ArrayList<Integer> currentTime = new ArrayList<Integer>();
        ArrayList<Integer> nextTime = new ArrayList<Integer>();
        
        currentTime.add(6); currentTime.add(40); currentTime.add(32);
        nextTime.add(6); nextTime.add(40); nextTime.add(33);
        assertEquals(nextTime, tiempo.nextSecond(currentTime));
        currentTime.clear();nextTime.clear();
        
        currentTime.add(8); currentTime.add(40); currentTime.add(59);
        nextTime.add(8); nextTime.add(41); nextTime.add(00);
        assertEquals(nextTime, tiempo.nextSecond(currentTime));
        currentTime.clear();nextTime.clear();
        
        currentTime.add(7); currentTime.add(59); currentTime.add(59);
        nextTime.add(8); nextTime.add(00); nextTime.add(00);
        assertEquals(nextTime, tiempo.nextSecond(currentTime));
        currentTime.clear();nextTime.clear();
        
        
        
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
