package banking.system;

public class User {
    
    // hard coded credentials
    private static final String user = "1";
    private static final String pin = "1";
    private final String name = "Jay Ganzan";
    private final String address = "105 Tres de Abril";
    private final String contact = "09123456789";
    
    public static String getUserId() {
        return user;
    }
    
    public static String getUserPin() {
        return pin; 
    }
}
