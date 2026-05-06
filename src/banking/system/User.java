package banking.system;

public class User {

    private String userId;
    private String pin;
    private String name;
    private String address;
    private String contact;

    public User(String userId, String pin, String name, String address, String contact) {
        this.userId = userId;
        this.pin = pin;         
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {    
        return pin;
    }

    public String getName() {
        return name;
    }
}   
