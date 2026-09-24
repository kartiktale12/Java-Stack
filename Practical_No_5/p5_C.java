package Practical_No_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p5_C extends JFrame implements ActionListener {

    JLabel nameLabel, numberLabel, unitsLabel, resultLabel;
    JTextField nameField, numberField, unitsField;
    JButton calculateButton;

    p5_C() {

        setTitle("Electricity Bill Calculator");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        nameLabel = new JLabel("Customer Name:");
        numberLabel = new JLabel("Customer Number:");
        unitsLabel = new JLabel("Units Consumed:");
        resultLabel = new JLabel("Result:");

        nameField = new JTextField();
        numberField = new JTextField();
        unitsField = new JTextField();

        calculateButton = new JButton("Calculate Bill");

        add(nameLabel);
        add(nameField);

        add(numberLabel);
        add(numberField);

        add(unitsLabel);
        add(unitsField);

        add(new JLabel(""));
        add(calculateButton);

        add(resultLabel);

        calculateButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String number = numberField.getText();
        String unitsText = unitsField.getText();

        if (name.isEmpty() || number.isEmpty() || unitsText.isEmpty()) {
            resultLabel.setText("Please fill all fields!");
            return;
        }

        try {
            int units = Integer.parseInt(unitsText);
            double bill;

            if (units <= 100) {
                bill = units * 2;
            } 
            else if (units <= 200) {
                bill = units * 3;
            } 
            else if (units <= 300) {
                bill = units * 5;
            } 
            else {
                bill = units * 7;
            }

            resultLabel.setText(
                "Customer: " + name + " | Bill: ₹" + bill
            );

        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid units!");
        }
    }

    public static void main(String[] args) {
        new p5_C();
    }
}