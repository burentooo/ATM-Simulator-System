package banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //for ActionListener and ActionEvent

public class Login extends JFrame {
    
    // 1. Declare variables at the class level so the listener method can access them
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("ATM Simulator");
        setLayout(null); 
        
        JLabel title = new JLabel("ATM Simulator System");
        title.setFont(new Font("Osward", Font.BOLD, 30));
        title.setBounds(225, 40, 400, 40);
        add(title);
        
        JLabel cardLabel = new JLabel("Card No:");
        cardLabel.setBounds(250, 150, 100, 30);
        add(cardLabel);

        // 2. Initialize the class-level variable
        cardTextField = new JTextField();
        cardTextField.setBounds(330, 150, 200, 30);
        add(cardTextField);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setBounds(250, 200, 100, 30);
        add(pinLabel);

        // 2. Initialize the class-level variable
        pinTextField = new JPasswordField();
        pinTextField.setBounds(330, 200, 200, 30);
        add(pinTextField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(330, 260, 100, 30);
        add(loginButton);        
        
        // 3. Attach the action listener to the button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                authenticateUser(); 
            }
        });
        
        setSize(800, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true); 
    }
    
    // 4. Move the method OUTSIDE of the constructor
    private void authenticateUser() {
        // hard coded credentials
        String validCardNumber = "1"; 
        String validPin = "1";
        
        String enteredCard = cardTextField.getText();
        String enteredPin = new String(pinTextField.getPassword());
        
        if(enteredCard.isBlank() || enteredPin.isBlank())  {
            JOptionPane.showMessageDialog(this, 
                "Fill out Fields", 
                "Authentication Failed", 
                JOptionPane.ERROR_MESSAGE);
        }
        
        else if (enteredCard.equals(validCardNumber) && enteredPin.equals(validPin)) {
            
            // Open the Account window 
            // Ensure you have an Account.java class created in this package
            new Account();
            setVisible(false);
            
        } else {
            
            // Failure: Show an error pop-up
            JOptionPane.showMessageDialog(this, 
                "Invalid Card Number or PIN. Please try again.", 
                "Authentication Failed", 
                JOptionPane.ERROR_MESSAGE);
                
            // Optional: Clear the fields after a failed attempt
            cardTextField.setText("");
            pinTextField.setText("");
            cardTextField.requestFocus(); // Set cursor back to the card number field
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}