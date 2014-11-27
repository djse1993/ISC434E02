/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
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
public class StringUtilityTest {
    
    public StringUtilityTest() {
    }
    
    @Test
    public void testStringUtility()
    {
        StringUtility su = new StringUtility();
        ArrayList<String> bag = new ArrayList<String>();
        String sep=null;
        String retorno=null;
        sep = " ";
        bag.add("hola"); bag.add("mundo"); 
        retorno = "hola mundo";
        
        
//        CONCATENANDO LAS PALABRAS
//        for (int i = 0; i < bag.size(); i++){
//            if(i < bag.size() - 1)            {
//                retorno += bag.get(i) + sep;
//            }
//            else{
//                retorno += bag.get(i);
//            }
//        }
        assertEquals(retorno, su.concat(bag, sep));
        bag.clear(); 
//        caso 2
        sep = "se";
        bag.add("David"); bag.add("sofoca"); 
        retorno = "Davidsesofoca";
        assertEquals(retorno, su.concat(bag, sep));
        bag.clear(); 
        //        caso 3
        sep = "delo";
        bag.add("Roberto"); bag.add("mio"); 
        retorno = "Robertodelomio";
        assertEquals(retorno, su.concat(bag, sep));
        bag.clear();           
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
