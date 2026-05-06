package banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame {
    
    Transaction(Account account, User user) {
        
        
        setTitle("Transaction");
        
        JLabel label = new JLabel("Transaction");
        label.setFont(new Font("Osward", Font.BOLD, 30));
        label.setBounds(316, 30, 400, 30);
        add(label);
        
        JLabel labelBalance = new JLabel("Balance: " + String.format("%.2f", account.getBalance()));
        labelBalance.setFont(new Font("Osward", Font.BOLD, 30));
        labelBalance.setBounds(100, 80, 350, 125);
        add(labelBalance);
        
        JLabel labelType = new JLabel("Type: " + account.getType());
        labelType.setFont(new Font("Osward", Font.BOLD, 30));
        labelType.setBounds(100,110,225,125);
        add(labelType);
        
        JLabel labelName = new JLabel("Name: " + user.getName());
        labelName.setFont(new Font("Osward", Font.BOLD, 30));
        labelName.setBounds(450,110,300,125);
        add(labelName);
        
        JButton goBackButton = new JButton("Back");
        goBackButton.setBounds(100, 250, 225, 125);
        add(goBackButton);
        
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new AccountScreen(account, user);
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
