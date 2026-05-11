package banking.system;

public class Bank {

    private static final String BANK_NAME = "JAY Bank";
    private static final String BANK_LOCATION = "104 Tres De Abril";

    // one user and one account
    User user = new User("1234", "1234", "Jay Ganzan", "105 Tres de Abril", "09123456789");
    Account account = new Account(5000);

    public boolean authenticateUser(String userId, String pin) {
        
        return userId.equals(user.getUserId()) && pin.equals(user.getPin());
    }

    public User getUser() {
        return user;
    }

    public Account getAccount() {
        return account;
    }

    public static String getBankName() {
        return BANK_NAME;
    }

    public static String getBankLocation() {
        return BANK_LOCATION;
    }
}