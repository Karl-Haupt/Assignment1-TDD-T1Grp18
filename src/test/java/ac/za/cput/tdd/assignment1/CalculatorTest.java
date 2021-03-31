/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

 /*
 * @author Duncan Harris - (220110530)
 */

public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("Add");
        int a = 1;
        int b = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.Add(a, b);
        assertEquals(expResult, result, "fail");
       
    }
    
     @Test
    public void testSubtract() {
        System.out.println("Subtract");
        int c = 2;
        int d = 1;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.Subtract(c, d);
        assertEquals(expResult, result, "fail");
       
    }
    
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testMultiply() {
        double a = 2.0;
        double b = 2.0;
        Calculator instance = new Calculator();
        double expResult = 4;
        double result = instance.Multiply(a, b);
        assertEquals(expResult, result, "fail");
       
    }
    
    @Test
    @Disabled("Disable until error is corrected")
    public void testDivide() {
        double c = 2.0;
        double d = 2.0;
        Calculator instance = new Calculator();
        double expResult = 1.0;
        double result = instance.Divide(c, d);
        assertEquals(expResult, result, "fail");
       
    }  
}
