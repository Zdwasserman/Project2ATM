package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.AccountManager;
import Wasserman.Zachary.Project2ATM.Account;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import Wasserman.Zachary.Project2ATM.User;
public class AccountManagerTest {

    @Test
    public void deleteAcccountTest(){
        AccountManager accManager = new AccountManager();
        Account acc1 = new Account("bob", 0.0);
        Account acc2 = new Account("fred", 0.0);
        accManager.accountList.add(acc1);
        accManager.accountList.add(acc2);
        accManager.deleteAccount(acc1);
        int expected = 1;
        int actual = accManager.accountList.size();
        assertEquals("Account list should have a size of 1", expected, actual);

    }

}
