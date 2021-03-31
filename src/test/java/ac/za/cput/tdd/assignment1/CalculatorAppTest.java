/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest
{
  /**
     * Test of Add method, of class CalculatorApp.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int a = 1;
        int b = 1;
        CalculatorApp instance = new CalculatorApp();
        int expResult = 2;
        int result = instance.Add(a, b);
        assertEquals(expResult, result, "fail");
    }

    /**
     * Test of Subtract method, of class CalculatorApp.
     */
    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        int c = 2;
        int d = 1;
        CalculatorApp instance = new CalculatorApp();
        int expResult = 1;
        int result = instance.Subtract(c, d);
        assertEquals(expResult, result, "fail");  
    }

    /**
     * Test of Multiply method, of class CalculatorApp.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        double a = 2.0;
        double b = 2.0;
        CalculatorApp instance = new CalculatorApp();
        double expResult = 4.0;
        double result = instance.Multiply(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Divide method, of class CalculatorApp.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        double c = 2.0;
        double d = 2.0;
        CalculatorApp instance = new CalculatorApp();
        double expResult = 1.0;
        double result = instance.Divide(c, d);
        assertEquals(expResult, result, 0.0);  
    }
}
