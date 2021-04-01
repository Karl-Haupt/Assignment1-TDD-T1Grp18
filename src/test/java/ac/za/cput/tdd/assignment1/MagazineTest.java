/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

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
 * @author Mahad
 */
public class MagazineTest 
{
    private Magazine name1;
    private Magazine name2;
    private Magazine name3;
    
    
    
    public MagazineTest() {
    }
    
    @BeforeEach
    public void setUp() {
        name1 = new Magazine();
        name2 = new Magazine();
        name3 = name1; 
    }
    
    // Object Equality
    @Test
    public void testEquality() {
        assertEquals(name1, name1);
        
    }
    //  Object Identity

    @Test
    public void testIdentity() {

        assertSame(name1, name3);
        
    }
    // failling Test
    @Test
    public void failingTest() {
       fail("This Must Fail");
        assertSame(name1,name3);
        
    }
    // TimeOuts
    @Test
    @Timeout(value = 100)
    public void testTimeout() {
        assertEquals(name1, name3);
    }
    
    // Disabling Test
    
    
    @Disabled ("Disabled this method ")
    @Test
      public void TestDis() {
       // fail("This Must Fail");
        assertSame(name1,name3);
      }
       
          
    
   
         
     
    
       
    
 
}
