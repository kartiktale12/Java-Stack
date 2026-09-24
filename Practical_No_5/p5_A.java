package Practical_No_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  p5_A extends JFrame implements ActionListener {

    JLabel nameLabel, rollLabel, marksLabel, resultLabel;
    JTextField nameField, rollField, marksField;
    JButton submitButton;

    p5_A() {

        setTitle("Student Registration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        nameLabel = new JLabel("Student Name:");
        rollLabel = new JLabel("Roll Number:");
        marksLabel = new JLabel("Marks:");
        resultLabel = new JLabel("Result:");

        nameField = new JTextField();
        rollField = new JTextField();
        marksField = new JTextField();

        submitButton = new JButton("Submit");

        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(marksLabel);
        add(marksField);

        add(new JLabel(""));
        add(submitButton);

        add(resultLabel);

        submitButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String roll = rollField.getText();
        String marksText = marksField.getText();

        if (name.isEmpty() || roll.isEmpty() || marksText.isEmpty()) {
            resultLabel.setText("Please fill all fields!");
            return;
        }

        try {
            double marks = Double.parseDouble(marksText);
            String grade;

            if (marks >= 90)
                grade = "A+";
            else if (marks >= 80)
                grade = "A";
            else if (marks >= 70)
                grade = "B";
            else if (marks >= 60)
                grade = "C";
            else if (marks >= 50)
                grade = "D";
            else
                grade = "F";

            resultLabel.setText(
                "Name: " + name + " | Roll: " + roll + " | Grade: " + grade
            );

        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid marks!");
        }
    }

    public static void main(String[] args) {
        new p5_A();
    }
}