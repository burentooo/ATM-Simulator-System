
package banking.system;

public class UserAccount {
    
    private double balance;

    public UserAccount(double balance) {
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
