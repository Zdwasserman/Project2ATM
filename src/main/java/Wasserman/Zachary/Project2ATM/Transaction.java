package Wasserman.Zachary.Project2ATM;

/**
 * Created by zacharywasserman on 9/18/16.
 */
public class Transaction {
    private Double amount;
    private int accountNum;
    private String description;
    public Transaction(Double amount, int accountNum, String description){
        this.amount = amount;
        this.accountNum = accountNum;
        this.description = description;
    }
     public double getAmount(){
         return amount;
     }
    public int getAccountNum(){
        return accountNum;
    }
    public String getDescription(){
        return description;
    }

        public Double withdraw(Account account, Double amount){
            account.setBalance(account.getBalance()  - amount);
            return account.getBalance();
        }
        public Double deposit(Account account, Double amount){
            account.setBalance(account.getBalance() + amount);
            return account.getBalance();
        }
        public void transfer(Account account1, Account account2, Double amount){
            withdraw(account1, amount);
            deposit(account2, amount);

        }
        public Double balance(Account account){
            return account.getBalance();
        }
    }


