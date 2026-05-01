package banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame {
    
    Transaction(UserAccount account) {
        
        
        setTitle("Transaction");
        
        JLabel label = new JLabel("Transaction");
        label.setFont(new Font("Osward", Font.BOLD, 30));
        label.setBounds(316, 30, 400, 30);
        add(label);
        
        JLabel labelBalance = new JLabel("Balance: " + account.getBalance());
        labelBalance.setFont(new Font("Osward", Font.BOLD, 30));
        labelBalance.setBounds(100, 80, 225, 125);
        add(labelBalance);
        
        JLabel labelType = new JLabel("Type: " + account.getType());
        labelType.setFont(new Font("Osward", Font.BOLD, 30));
        labelType.setBounds(100,110,225,125);
        add(labelType);
        
        JButton goBackButton = new JButton("Back");
        goBackButton.setBounds(100, 250, 225, 125);
        add(goBackButton);
        
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new Account(account);
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
