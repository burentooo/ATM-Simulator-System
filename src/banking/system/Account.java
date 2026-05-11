
package banking.system;

public class Account {
    
    private double balance;
    private String transactionType;

    
    public String getTransactionType() {
        return transactionType;
    }
    
    public void setTransactionType(String t) {
        this.transactionType = t;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
