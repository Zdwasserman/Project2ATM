package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.AccountManager;
import Wasserman.Zachary.Project2ATM.Account;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AccountManagerTest {


    @Test
    public void getAccountTest(){
        ArrayList<Account> accountList = new ArrayList<>();
        AccountManager accManager = new AccountManager();
        Account acc1 = new Account("bob", 0.0);
        accountList.add(acc1);
        Account expected = acc1;
        Account actual = accManager.getAccount(1001);
        assertEquals(expected, actual);
    }
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
//    @Test
//    public void createAccount(){
//        AccountManager accManager = new AccountManager();
//        Account account = new Account();
//        accManager.createAccount("fred", "Checking");
//        int expected =
//    }

}
