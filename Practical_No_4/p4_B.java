package Practical_No_4;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;
public class p4_B {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Rahul");
        employees.add("Amit");
        employees.add("Priya");
        employees.add("Neha");
        employees.add("Karan");

        TreeSet<Integer> salaries = new TreeSet<>();

        salaries.add(45000);
        salaries.add(55000);
        salaries.add(40000);
        salaries.add(60000);
        salaries.add(50000);

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Rahul");
        employeeMap.put(102, "Amit");
        employeeMap.put(103, "Priya");
        employeeMap.put(104, "Neha");
        employeeMap.put(105, "Karan");

        System.out.println("Employee Names:");
        for (String name : employees) {
            System.out.println(name);
        }

        System.out.println("\nEmployee Salaries in Ascending Order:");
        for (Integer salary : salaries) {
            System.out.println(salary);
        }
        int searchId = 103;

        System.out.println("\nSearching Employee ID: " + searchId);

        if (employeeMap.containsKey(searchId)) {
            System.out.println("Employee Name: " + employeeMap.get(searchId));
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nAll Employee Records:");
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID: " + id +
                    " | Name: " + employeeMap.get(id));
        }
    }
}