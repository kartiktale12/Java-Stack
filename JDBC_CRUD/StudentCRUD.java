import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

        static final String URL = "jdbc:mysql://localhost:3306/college";

        static final String USER = "root";

        static final String PASSWORD = "root@123";

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                try {

                        // Establish connection
                        Connection con = DriverManager.getConnection(
                                        URL, USER, PASSWORD);

                        System.out.println(
                                        "Database connected successfully!");

                        int choice;

                        do {

                                System.out.println(
                                                "\n===== STUDENT CRUD MENU =====");

                                System.out.println(
                                                "1. Create Student");

                                System.out.println(
                                                "2. Read Students");

                                System.out.println(
                                                "3. Update Student");

                                System.out.println(
                                                "4. Delete Student");

                                System.out.println(
                                                "5. Exit");

                                System.out.print(
                                                "Enter your choice: ");

                                choice = sc.nextInt();

                                switch (choice) {

                                        // CREATE
                                        case 1:

                                                System.out.print(
                                                                "Enter Roll Number: ");

                                                int roll = sc.nextInt();

                                                sc.nextLine();

                                                System.out.print(
                                                                "Enter Name: ");

                                                String name = sc.nextLine();

                                                System.out.print(
                                                                "Enter Marks: ");

                                                double marks = sc.nextDouble();

                                                String insertSQL = "INSERT INTO student " +
                                                                "VALUES (?, ?, ?)";

                                                PreparedStatement insert = con.prepareStatement(
                                                                insertSQL);

                                                insert.setInt(1, roll);
                                                insert.setString(2, name);
                                                insert.setDouble(3, marks);

                                                insert.executeUpdate();

                                                System.out.println(
                                                                "Student inserted successfully.");

                                                insert.close();

                                                break;

                                        // READ
                                        case 2:

                                                String selectSQL = "SELECT * FROM student";

                                                PreparedStatement select = con.prepareStatement(
                                                                selectSQL);

                                                ResultSet rs = select.executeQuery();

                                                System.out.println(
                                                                "\nRoll No\tName\tMarks");

                                                while (rs.next()) {

                                                        System.out.println(
                                                                        rs.getInt("roll_no")
                                                                                        + "\t" +
                                                                                        rs.getString("name")
                                                                                        + "\t" +
                                                                                        rs.getDouble("marks"));
                                                }

                                                rs.close();
                                                select.close();

                                                break;

                                        // UPDATE
                                        case 3:

                                                System.out.print(
                                                                "Enter Roll Number: ");

                                                int updateRoll = sc.nextInt();

                                                System.out.print(
                                                                "Enter New Marks: ");

                                                double newMarks = sc.nextDouble();

                                                String updateSQL = "UPDATE student SET " +
                                                                "marks = ? " +
                                                                "WHERE roll_no = ?";

                                                PreparedStatement update = con.prepareStatement(
                                                                updateSQL);

                                                update.setDouble(
                                                                1, newMarks);

                                                update.setInt(
                                                                2, updateRoll);

                                                int updated = update.executeUpdate();

                                                if (updated > 0) {

                                                        System.out.println(
                                                                        "Student updated successfully.");

                                                } else {

                                                        System.out.println(
                                                                        "Student not found.");
                                                }

                                                update.close();

                                                break;

                                        // DELETE
                                        case 4:

                                                System.out.print(
                                                                "Enter Roll Number: ");

                                                int deleteRoll = sc.nextInt();

                                                String deleteSQL = "DELETE FROM student " +
                                                                "WHERE roll_no = ?";

                                                PreparedStatement delete = con.prepareStatement(
                                                                deleteSQL);

                                                delete.setInt(
                                                                1, deleteRoll);

                                                int deleted = delete.executeUpdate();

                                                if (deleted > 0) {

                                                        System.out.println(
                                                                        "Student deleted successfully.");

                                                } else {

                                                        System.out.println(
                                                                        "Student not found.");
                                                }

                                                delete.close();

                                                break;

                                        // EXIT
                                        case 5:

                                                System.out.println(
                                                                "Exiting program...");

                                                break;

                                        default:

                                                System.out.println(
                                                                "Invalid choice.");
                                }

                        } while (choice != 5);

                        con.close();

                        sc.close();

                        System.out.println(
                                        "Database connection closed.");

                } catch (SQLException e) {

                        System.out.println(
                                        "Database Error: " +
                                                        e.getMessage());
                }
        }
}
