package ATM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATMBankingSystem extends JFrame implements ActionListener {

    JTextField amountField;
    JButton depositButton, withdrawButton, balanceButton;
    JLabel statusLabel;
    Account acc = new Account();

    public ATMBankingSystem() {
        setTitle("ATM Banking System");
        setSize(300, 200);
        setLayout(new BorderLayout());

        Panel buttonsPanel = new Panel(new GridLayout(4, 1));

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(this);
        buttonsPanel.add(depositButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);
        buttonsPanel.add(withdrawButton);

        balanceButton = new JButton("Balance Enquiry");
        balanceButton.addActionListener(this);
        buttonsPanel.add(balanceButton);

        Panel amountPanel = new Panel(new FlowLayout());
        Label amountLabel = new Label("Amount:");
        amountPanel.add(amountLabel);
        amountField = new JTextField(10);
        amountPanel.add(amountField);

        statusLabel = new JLabel("");
        statusLabel.setHorizontalAlignment(JLabel.CENTER);

        add(buttonsPanel, BorderLayout.CENTER);
        add(amountPanel, BorderLayout.NORTH);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == balanceButton && acc.getBalance() != 0)
            statusLabel.setText("Current balance: " + acc.getBalance());

        else if (amountField.getText().equals("")) {
            statusLabel.setText("Please enter an amount");
            return;
        }
        String amountStr = amountField.getText();
        double amount = Double.parseDouble(amountStr);

        if (e.getSource() == depositButton) {
            acc.deposit(amount);
            statusLabel.setText("Deposit successful");
            amountField.setText("");
        } else if (e.getSource() == withdrawButton) {
            acc.withdraw(amount);
            statusLabel.setText("Withdrawal successful");
            amountField.setText("");
        }
    }

    public static void main(String[] args) {
        new ATMBankingSystem();
    }
}
