package Practical_No_5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p5_B extends JFrame implements ActionListener {

    JLabel nameLabel, idLabel, salaryLabel, resultLabel;
    JTextField nameField, idField, salaryField;
    JButton calculateButton;

    p5_B() {

        setTitle("Employee Salary Calculator");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        nameLabel = new JLabel("Employee Name:");
        idLabel = new JLabel("Employee ID:");
        salaryLabel = new JLabel("Basic Salary:");
        resultLabel = new JLabel("Result:");

        nameField = new JTextField();
        idField = new JTextField();
        salaryField = new JTextField();

        calculateButton = new JButton("Calculate Salary");

        add(nameLabel);
        add(nameField);

        add(idLabel);
        add(idField);

        add(salaryLabel);
        add(salaryField);

        add(new JLabel(""));
        add(calculateButton);

        add(resultLabel);

        calculateButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String id = idField.getText();
        String salaryText = salaryField.getText();

        if (name.isEmpty() || id.isEmpty() || salaryText.isEmpty()) {
            resultLabel.setText("Please fill all fields!");
            return;
        }

        try {
            double basicSalary = Double.parseDouble(salaryText);

            double hra = basicSalary * 0.20;
            double da = basicSalary * 0.10;
            double grossSalary = basicSalary + hra + da;

            resultLabel.setText(
                "Gross Salary: ₹" + grossSalary
            );

        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid salary!");
        }
    }

    public static void main(String[] args) {
        new p5_B();
    }
}