package Practical_No_4;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

public class  p4_A{
    public static void main(String[] args) {

        // 1. ArrayList - Store student names
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rahul");

        // 2. TreeSet - Store student marks
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(72);
        marks.add(95);
        marks.add(85);
        marks.add(60);

        // 3. HashMap - Store Roll Number and Student Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Rahul");
        studentMap.put(102, "Amit");
        studentMap.put(103, "Priya");
        studentMap.put(104, "Neha");

        // Display ArrayList
        System.out.println("Student Names:");
        System.out.println(students);

        // Display TreeSet
        System.out.println("\nStudent Marks:");
        System.out.println(marks);

        // Display HashMap
        System.out.println("\nStudent Roll Number and Names:");
        System.out.println(studentMap);

        // Difference
        System.out.println("\nDifference:");
        System.out.println("ArrayList: Allows duplicate elements and maintains insertion order.");
        System.out.println("TreeSet: Removes duplicates and stores elements in sorted order.");
        System.out.println("HashMap: Stores data in key-value pairs.");
    }
}