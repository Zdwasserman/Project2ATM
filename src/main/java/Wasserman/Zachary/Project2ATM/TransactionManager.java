package Wasserman.Zachary.Project2ATM;

import java.util.ArrayList;

/**
 * Created by zacharywasserman on 9/18/16.
 */
public class TransactionManager {
    protected ArrayList<Transaction> transactionList = new ArrayList<>();

    public void printTransaction(){
        System.out.println("Transaction Log");
        System.out.println("---------------");
        for(int i = 0; i < transactionList.size(); i++){
            System.out.println(" Account Number: " + transactionList.get(i).getAccountNum() +transactionList.get(i).getAmount() +" "+transactionList.get(i).getDescription());
        }
    }

}
