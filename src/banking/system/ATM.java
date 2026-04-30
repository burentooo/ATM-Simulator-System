package banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM extends JFrame {
    
    
    JTextField cardTextField;
    JPasswordField pinTextField;

    ATM() {
        setTitle("ATM Simulator");
        setLayout(null); 
        
        JLabel title = new JLabel("ATM Simulator System");
        
        title.setFont(new Font("Osward", Font.BOLD, 30));
        title.setBounds(225, 40, 400, 40);
        add(title);
        
        JLabel bank = new JLabel(Bank.getBankName());
        bank.setFont(new Font("Osward", Font.BOLD, 20));
        bank.setBounds(225, 70, 400, 40);
        add(bank);
        
        JLabel bankLocation = new JLabel(Bank.getBankLocation());
        bankLocation.setFont(new Font("Osward", Font.BOLD, 10));
        bankLocation.setBounds(225, 90, 400, 40);
        add(bankLocation);
        
        JLabel cardLabel = new JLabel("Card No:");
        cardLabel.setBounds(250, 150, 100, 30);
        add(cardLabel);

        
        cardTextField = new JTextField();
        cardTextField.setBounds(330, 150, 200, 30);
        add(cardTextField);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setBounds(250, 200, 100, 30);
        add(pinLabel);

        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(330, 200, 200, 30);
        add(pinTextField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(330, 260, 100, 30);
        add(loginButton);        
        
        
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
    
    
    private void authenticateUser() {

        String enteredCard = cardTextField.getText();
        String enteredPin = new String(pinTextField.getPassword());
        
        if(enteredCard.isBlank() || enteredPin.isBlank())  {
            JOptionPane.showMessageDialog(this, 
                "Fill out Fields", 
                "Authentication Failed", 
                JOptionPane.ERROR_MESSAGE);
        }
        
        else if (enteredCard.equals(User.getUserId()) && enteredPin.equals(User.getUserPin())) {
            
            //opens account screen
            UserAccount user = new UserAccount(5000);
            new Account(user);
            
            setVisible(false);
            
        } else {
            
            JOptionPane.showMessageDialog(this, 
                "Invalid Card Number or PIN. Please try again.", 
                "Authentication Failed", 
                JOptionPane.ERROR_MESSAGE);
                
            //clear after error
            cardTextField.setText("");
            pinTextField.setText("");
            cardTextField.requestFocus();
        }
    }
    
    public static void main(String[] args) {
        new ATM();
    }
}