package Wasserman.Zachary.Project2ATM;

import java.util.ArrayList;


public class TransactionManager {
    // a list that holds all transactions
    public ArrayList<Transaction> transactionList = new ArrayList<>();

    // loops through the transaction list and displays all transactions
    public void printTransaction(){
        System.out.println("Transaction Log");
        System.out.println("---------------");
        for(int i = 0; i < transactionList.size(); i++){
            System.out.println(" Account Number: " + transactionList.get(i).getAccountNum()+" " +transactionList.get(i).getAmount() +" "+transactionList.get(i).getDescription());
        }
    }

}
