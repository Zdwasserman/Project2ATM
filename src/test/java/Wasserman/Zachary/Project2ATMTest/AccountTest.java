package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.Account;
import org.junit.Test;
import static org.junit.Assert.*;
public class AccountTest {

    @Test
    public void accountConstructorTest(){

        Account acc1 = new Account("Squirtle", Account.AccountType.CHECKING, 0.0);
        Account acc2 = new Account("Charmander", Account.AccountType.CHECKING, 0.0);
        int expected = 1000000002;
        int actual = acc2.getAccountNum();
        assertEquals("account number should be 1000000002", expected, actual);



    }
}
