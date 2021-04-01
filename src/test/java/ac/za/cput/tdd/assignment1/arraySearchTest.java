/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;
/**
 *
 * @author Jody Heideman 219307725
 */
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author 21930
 */
public class arraySearchTest {
    
    private arraySearch max , min , newMin , name , sum;
    
    public arraySearchTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        max = new arraySearch();
           min = new arraySearch();
             newMin = new arraySearch();
                 name = new arraySearch();
                     sum = new arraySearch();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findMax method, of class arraySearch.
     */
    @Test
    public void testFail() {
         int result = max.findMax(new int[]{1 , 11 , 5 , 10});
        
        assertEquals(11 , result);
        fail("Intentional");
    }

    /**
     * Test of findMin method, of class arraySearch.
     */
    @Test
    public void testEquality() {
        int result = min.findMin(new int[]{1 , 11 , 5 , 10});
     
     assertEquals(1 , result);
    }

    /**
     * Test of newMin method, of class arraySearch.
     */
    @Test
    public void testIdentity() {
        int minValue = min.findMax(new int[]{1 , 11 , 5 , 10});
        int newMinValue = min.findMax(new int[]{1 , 11 , 5 , 10});
        
        assertSame(minValue , newMinValue);
    }
    
    /**
     * Test of findName method, of class App.
     */
   
    @Test
    public void testTimeout(){
       
          String result = name.findName(new String[]{"Brad" , "Chris" , "Norman" ,"Jody"});
          assertEquals("Jody" , result);
           assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
        while (true);
        
        });   
    }
    

  /**
     * Test of sumArray method, of class App.
     */
    @Disabled
    @Test
    public void testSumArray() {
      
        int result = sum.sumArray(new int[]{1 , 11 , 5 , 10});
        assertEquals(27 , result);
        
    }
    
}
