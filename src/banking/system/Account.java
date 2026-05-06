
package banking.system;

public class Account {
    
    private double balance;
    private String type;

    
    public String getType() {
        return type;
    }
    
    public void setType(String t) {
        this.type = t;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
