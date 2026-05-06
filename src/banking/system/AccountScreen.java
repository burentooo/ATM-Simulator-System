package banking.system;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AccountScreen extends JFrame {
    
    Account account;
    User user;
    
    AccountScreen(Account account, User user) {
        this.account = account;
        this.user = user;
        
        setTitle("Account");
        
        JLabel label = new JLabel("Welcome! " + user.getName());
        label.setFont(new Font("Osward", Font.BOLD, 30));
        label.setBounds(250, 30, 400, 30);
        add(label);
        
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(100, 80, 225, 125);
        add(withdrawButton);
        
        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(450, 80, 225, 125);
        add(depositButton);
        
        JButton balanceButton = new JButton("Balance");
        balanceButton.setBounds(100, 250, 225, 125);
        add(balanceButton);
        
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String input = JOptionPane.showInputDialog("Enter amount to withdraw:");
                
                if(input == null) {
                    return;
                }
                
                if(input.isBlank()) {
                    JOptionPane.showMessageDialog(AccountScreen.this, "Empty Field", "Error",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    try {
                        double amount = Double.parseDouble(input);
                        
                        if(account.withdraw(amount)) {
                            account.setType("withdraw");
                            
                            new Transaction(account, user);
                            
                            setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(AccountScreen.this, "Insufficient Balance!", "Error",JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } catch(Exception ex) {
                        JOptionPane.showMessageDialog(AccountScreen.this, "Invalid Input");
                    }
                    
                }
            }
        });
        
        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(AccountScreen.this, 
                String.format("%.2f", account.getBalance()),
                "Available Balance", 
                JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(450, 250, 225, 125);
        add(exitButton);
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new ATM();
                setVisible(false);
            }
        });

        setLayout(null);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
