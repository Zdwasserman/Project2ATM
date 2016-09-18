package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.Account;
import Wasserman.Zachary.Project2ATM.ATM;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;
/**
 * Created by zacharywasserman on 9/18/16.
 */
public class ATMTest {
    @Test
    public void withdrawTest(){
        ATM atm = new ATM();
        Account acc1 = new Account("Squirtle", 500.0);
        Double expected = 300.0;
        Double actual = atm.withdraw(acc1, 200.0);
        assertEquals("account balance should be 300.0",actual, expected);
    }
    @Test
    public void depositTest(){
        ATM atm = new ATM();
        Account acc1 = new Account("Squirtle", 500.0);
        Double expected = 800.0;
        Double actual = atm.deposit(acc1, 300.0);
        assertEquals("account balance should be 800.0", actual, expected);
    }
    @Test
    public void balanceTest(){
        ATM atm = new ATM();
        Account acc1 = new Account("Squirtle", 500.0);
        Double expected = 500.0;
        Double actual = atm.balance(acc1);
        assertEquals("account balance should be 500.0", actual, expected);

    }
    @Test
    public void transferTest(){

    }
}
