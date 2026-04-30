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
        
        JLabel labelTransaction = new JLabel("Balance: " + account.getBalance());
        labelTransaction.setFont(new Font("Osward", Font.BOLD, 30));
        labelTransaction.setBounds(100, 80, 225, 125);
        add(labelTransaction);
        
        
        setLayout(null);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
