package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.Account;
import org.junit.Test;
import Wasserman.Zachary.Project2ATM.Transaction;
import static org.junit.Assert.*;
/**
 * Created by zacharywasserman on 9/18/16.
 */
public class TransactionTest {
    @Test
    public void withdrawTest(){
        Transaction atm = new Transaction(null, 0, null);
        Account acc1 = new Account("Squirtle", 500.0);
        Double expected = 300.0;
        Double actual = atm.withdraw(acc1, 200.0);
        assertEquals("account balance should be 300.0",actual, expected);
    }
    @Test
    public void depositTest(){
        Transaction atm = new Transaction(null, 0, null);
        Account acc1 = new Account("Squirtle", 500.0);
        Double expected = 800.0;
        Double actual = atm.deposit(acc1, 300.0);
        assertEquals("account balance should be 800.0", actual, expected);
    }
    @Test
    public void balanceTest(){
        Transaction atm = new Transaction(null, 0, null);
        Account acc1 = new Account("Squirtle", 500.0);
        Double expected = 500.0;
        Double actual = atm.balance(acc1);
        assertEquals("account balance should be 500.0", actual, expected);

    }
    @Test
    public void transferTest(){
        Transaction atm = new Transaction(null, 0, null);
        Account acc1 = new Account("Squirtle", 500.0);
        Account acc2 = new Account("charmnder", 1000.00);
        atm.transfer(acc1, acc2, 300.0);
        Double expected = 200.0;
        Double expected2 = 1200.0;
        Double actual = atm.balance(acc1);
        Double actual2 = atm.balance(acc2);
        assertEquals("account1 balance should be 200.0", expected, actual);
        assertEquals("account2 balance should be 1200.0", expected, actual);
    }
}

