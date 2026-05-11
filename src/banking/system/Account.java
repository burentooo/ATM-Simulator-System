
package banking.system;

public class Account {
    
    private double balance;
    private String transactionType;
    private double transactionAmount;
    
    public String getTransactionType() {
        return transactionType;
    }
    
    public double getTransactionAmount() {
        return transactionAmount;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if(amount > 0){
            balance += amount;
            transactionAmount = amount;
            transactionType = "deposit";
            
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            transactionAmount = amount;
            transactionType = "withdraw";
            
            return true;
        }
        return false;
    }
}
