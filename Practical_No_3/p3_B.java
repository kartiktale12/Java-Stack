package Practical_No_3;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class  p3_B{
    public static void main(String[] args) {

        try {
            // Create and write data to books.txt
            FileWriter writer = new FileWriter("books.txt");

            writer.write("Book ID: 101\n");
            writer.write("Book Title: Java Programming\n");
            writer.write("Author Name: James Gosling\n");

            writer.close();

            System.out.println("Book information written successfully.\n");

            // Read data from books.txt
            FileReader reader = new FileReader("books.txt");

            int ch;

            System.out.println("Library Book Information:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
