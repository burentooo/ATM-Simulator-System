public class User {
    private int id;
    private int pin;
    private double balance;

    public User(int id, int pin, double balance) {
        this.id = id;
        this.pin = pin;
        this.balance = balance;
    }

    public int getId() { return id; }
    public int getPin() { return pin; }
    public double getBalance() { return balance; }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
