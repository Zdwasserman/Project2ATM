package Wasserman.Zachary.Project2ATMTest;
import Wasserman.Zachary.Project2ATM.TransactionManager;
import Wasserman.Zachary.Project2ATM.Account;
import Wasserman.Zachary.Project2ATM.Transaction;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * Created by zacharywasserman on 9/18/16.
 */
public class TransactionManagerTest {
    @Test
    public void printTransctionListTest(){
        //ArrayList<Transaction> transactionList = new ArrayList<>();
        TransactionManager transManager = new TransactionManager();
        Transaction atm = new Transaction(0.0, 1, "withdraw");
        Account acc1 = new Account("bob", 0.0);
        atm.withdraw(acc1, 200.0);
        transManager.transactionList.add(atm);
        transManager.printTransaction();
        Boolean expected =  true;
        Boolean actual = transManager.transactionList.add(atm);
        assertEquals(expected, actual);

    }
}
