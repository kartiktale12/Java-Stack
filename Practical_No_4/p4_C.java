package Practical_No_4;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;
public class p4_C {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Database Management");
        books.add("Operating System");
        books.add("Computer Networks");

        TreeSet<Integer> bookIds = new TreeSet<>();

        bookIds.add(105);
        bookIds.add(102);
        bookIds.add(104);
        bookIds.add(101);
        bookIds.add(103);

        HashMap<Integer, String> library = new HashMap<>();

        library.put(101, "Java Programming");
        library.put(102, "Data Structures");
        library.put(103, "Database Management");
        library.put(104, "Operating System");
        library.put(105, "Computer Networks");

        System.out.println("Book Names:");
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("\nBook IDs in Sorted Order:");
        for (Integer id : bookIds) {
            System.out.println(id);
        }

        int searchId = 103;

        System.out.println("\nSearching Book ID: " + searchId);

        if (library.containsKey(searchId)) {
            System.out.println("Book Name: " + library.get(searchId));
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("\nAll Library Records:");
        for (Integer id : library.keySet()) {
            System.out.println("Book ID: " + id +
                    " | Book Name: " + library.get(id));
        }
    }
}