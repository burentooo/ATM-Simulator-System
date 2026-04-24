package banking.system;
import java.awt.Font;
import javax.swing.*;

public class Account extends JFrame {
    
    Account() {

        setTitle("Account");

        JLabel label = new JLabel("Welcome!");
        label.setFont(new Font("Osward", Font.BOLD, 30));
        label.setBounds(316, 30, 400, 30);
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
        
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(450, 250, 225, 125);
        add(exitButton);

        setLayout(null);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
