package Students;// This program creates an ArrayList of Student objects,
// sorts them by their grade in descending order,
// prints all students, prints the top and bottom student, 
// and finally prints the average and total of all students' grades.

import java.util.ArrayList; // Import ArrayList to use a resizable list
import java.util.Collections; // Import Collections for sorting the list

public class studentsMain { // Class containing the main method

    public static void main(String[] args) {
        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add new Student objects to the list
        students.add(new Student("Rodrigue", 10, 98.5));
        students.add(new Student("Rod", 20, 58.5));
        students.add(new Student("Bobo", 30, 68.5));
        students.add(new Student("Alane", 40, 78.5));
        students.add(new Student("Toto", 50, 88.5));
        students.add(new Student("Rene", 15, 98.5));

        // Print introductory message
        System.out.print("Students details: ");

        // Sort the students list by grade in descending order
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()));

        // Loop through the sorted list and print each student's details
        for (Student student : students) {
            System.out.println("\n" + student);
        }

        // Call method to print the top and bottom students
        printTopStudent(students);

        // Call method to print the average and total of all students' grades
        printAverageAndTotal(students);
    }

    // Method to print the top and bottom students from the list
    public static void printTopStudent(ArrayList<Student> list) {
        System.out.println("Top student " + list.get(0)); // First element after sorting is top student
        System.out.println("Bottom Student" + list.get(list.size() - 1)); // Last element is bottom student
    }

    // Method to calculate and print the average grade and cumulative total
    public static void printAverageAndTotal(ArrayList<Student> list) {
        double total = 0;

        // Loop through the list and sum up all grades
        for (Student grade : list) {
            total += grade.getGrade();
        }

        // Calculate and print the average
        System.out.println("The average is " + (total / list.size()));

        // Print the cumulative total
        System.out.println("The cumulative total is: " + total);
    }
}