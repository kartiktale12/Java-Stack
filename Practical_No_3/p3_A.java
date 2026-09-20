package Practical_No_3;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class p3_A {
    public static void main(String[] args) {

        try {
            // Create and write data to employee.txt
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee ID: 101\n");
            writer.write("Employee Name: Kartik\n");
            writer.write("Department: Computer Technology\n");
            writer.write("Salary: 50000\n");

            writer.close();

            System.out.println("Data written successfully.\n");

            // Read data from employee.txt
            FileReader reader = new FileReader("employee.txt");

            int ch;

            System.out.println("Employee Details:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}