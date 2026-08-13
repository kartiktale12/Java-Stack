class Student {
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate average
    double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    // Method to display details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Average Marks: " + calculateAverage());
    }
}

public class  Practical_No_1{
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student("Kartik", 80, 75, 85);

        // Calling method
        s1.display();
    }
}


