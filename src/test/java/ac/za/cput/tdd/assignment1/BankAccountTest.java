/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

 /*
 * @author Karl H - (220236585)
 */

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class BankAccountTest {
    
    private BankAccount bankAcc1;
    private BankAccount bankAcc2;
    private BankAccount bankAcc3;

    @BeforeEach
    public void setUp() {
        bankAcc1 = new BankAccount("John", "#56721022");
        bankAcc2 = new BankAccount("Peter", "#22234948");
        bankAcc3 = bankAcc1;
    }
    
     //Object Equality Test
    @Test
    public void testBankAccountEquality() {
        assertEquals(bankAcc1, bankAcc3);
    }
    
    //Object Identity Test
    @Test
    public void testBankAccountIdentity() {
        assertSame(bankAcc1, bankAcc2);
    }
    
    //Failing Test
    @Test
    public void testFailWithdraw() {
        fail("Widthraw is less than zero");
    }
    
    //Timeouts test
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testTimoutBankAccountEquality() {
        assertEquals(bankAcc1, bankAcc3);
    }
    
    //Disabling Test
    @Ignore
    @Test
    public void IgnoreTest() {
        assertSame(bankAcc1, bankAcc3);
    }
    
    
}
