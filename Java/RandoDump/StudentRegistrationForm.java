package classroom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    private JLabel titleLabel, idLabel, nameLabel, dobLabel, emailLabel, mobileLabel;
    private JTextField idField, nameField, dobField, emailField, mobileField;
    private JButton submitButton, clearButton;

    public StudentRegistrationForm() {
        // Set up the JFrame
        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the labels
        titleLabel = new JLabel("Student Registration Form", JLabel.CENTER);
        idLabel = new JLabel("Student ID:");
        nameLabel = new JLabel("Name:");
        dobLabel = new JLabel("Date of Birth (dd/mm/yyyy):");
        emailLabel = new JLabel("Email:");
        mobileLabel = new JLabel("Mobile Number:");

        // Create the text fields
        idField = new JTextField();
        nameField = new JTextField();
        dobField = new JTextField();
        emailField = new JTextField();
        mobileField = new JTextField();

        // Create the buttons
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add the components to the JFrame
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(dobLabel);
        panel.add(dobField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(mobileLabel);
        panel.add(mobileField);
        panel.add(submitButton);
        panel.add(clearButton);

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // String id = idField.getText();
            // String name = nameField.getText();
            // String dob = dobField.getText();
            // String email = emailField.getText();
            // String mobile = mobileField.getText();

            JOptionPane.showMessageDialog(this, "Student data submitted successfully.");
        } else if (e.getSource() == clearButton) {
            idField.setText("");
            nameField.setText("");
            dobField.setText("");
            emailField.setText("");
            mobileField.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}