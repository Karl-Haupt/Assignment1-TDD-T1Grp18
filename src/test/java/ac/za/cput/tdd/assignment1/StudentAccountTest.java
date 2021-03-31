/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

import java.util.concurrent.TimeUnit;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Damone 219093717
 */
public class StudentAccountTest {

    private StudentAccount x;
    private StudentAccount y;
    private StudentAccount z;

    public StudentAccountTest() {
    }

   
    @BeforeEach
    public void setUp() {

        x = new StudentAccount();
        y = new StudentAccount();
        z = x;

    }

    //Object Equality
    
    @Test
    public void testEquality() {
        assertEquals(y, z);
    }

    //Object Identity
    @Test
    public void testIdentity() {

        assertSame(x, z);
    }

    
    
    //Failing Test
    @Test
    public void failingTest() {
        assertSame(x,y);
        
    }

    //test timeout pass 
    //@Test
    //@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
   
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Pass");
        }
    }

    //Disable method
    @Disabled("Do not run in lower environment")
    @Test
    public void testOnDev() {
        System.setProperty("ENV", "DEV");
        //Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

  

}
