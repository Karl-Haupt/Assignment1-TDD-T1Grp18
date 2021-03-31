/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

 /*
 * @author Duncan Harris - (220110530)
 */

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

public class CalculatorAppTest
{
  public CalculatorAppTest()
  {
  
  }

    @Test
    public void testAdd() {
        System.out.println("Add");
        int a = 1;
        int b = 1;
        CalculatorApp instance = new CalculatorApp();
        int expResult = 2;
        int result = instance.Add(a, b);
        assertEquals(expResult, result);
       
        fail("Method should add to variables");
    }

    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        int a = 2;
        int b = 1;
        CalculatorApp instance = new CalculatorApp();
        int expResult = 4;
        int result = instance.Subtract(a, b);
        assertEquals(expResult, result);
        
        fail("Method should show the difference between two variables");
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testMultiply() {
        System.out.println("Multiply");
        double a = 2.0;
        double b = 2.0;
        CalculatorApp instance = new CalculatorApp();
        double expResult = 8.0;
        double result = instance.Multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        fail("Method should display the product of two variables");
    }

    @Test
    @Disabled("Disabled until further notice")
    public void testDivide() {
        System.out.println("Divide");
        double a = 4.0;
        double b = 2.0;
        CalculatorApp instance = new CalculatorApp();
        double expResult = 2.0;
        double result = instance.Divide(a, b);
        assertEquals(expResult, result, 0.0);
        
        fail("Method should display the what happens when two variables divide amongst themselves");
    }
}
