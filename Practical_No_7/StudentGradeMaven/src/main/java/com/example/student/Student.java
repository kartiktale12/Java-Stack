
package com.example.student;

public class Student {
    private int id;
    private String name;
    private String branch;
    private double marks;

    public Student(int id, String name, String branch, double marks) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    public void display() {
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Branch     : " + branch);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println("-------------------------");
    }
}
