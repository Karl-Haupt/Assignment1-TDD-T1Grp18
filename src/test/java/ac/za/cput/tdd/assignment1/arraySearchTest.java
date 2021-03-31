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
     * Test of getMax method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        arraySearch instance = new arraySearch();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        int max = 0;
        arraySearch instance = new arraySearch();
        instance.setMax(max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        arraySearch instance = new arraySearch();
        int expResult = 0;
        int result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMin method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testSetMin() {
        System.out.println("setMin");
        int min = 0;
        arraySearch instance = new arraySearch();
        instance.setMin(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewMin method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testGetNewMin() {
        System.out.println("getNewMin");
        arraySearch instance = new arraySearch();
        int expResult = 0;
        int result = instance.getNewMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewMin method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testSetNewMin() {
        System.out.println("setNewMin");
        int newMin = 0;
        arraySearch instance = new arraySearch();
        instance.setNewMin(newMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSum method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        arraySearch instance = new arraySearch();
        int expResult = 0;
        int result = instance.getSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSum method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testSetSum() {
        System.out.println("setSum");
        int sum = 0;
        arraySearch instance = new arraySearch();
        instance.setSum(sum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testGetName() {
        System.out.println("getName");
        arraySearch instance = new arraySearch();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        arraySearch instance = new arraySearch();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class arraySearch.
     */
    @Disabled
    @Test
    public void testToString() {
        System.out.println("toString");
        arraySearch instance = new arraySearch();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class arraySearch.
     */
    @Test
    public void testFail() {
         int result = max.findMax(new int[]{1 , 11 , 5 , 10});
        
        assertEquals(11 , result);
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
