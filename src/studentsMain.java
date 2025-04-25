import Students.Student;
import java.util.ArrayList;
import java.util.Collections;

public class studentsMain {
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();
        students.add(new Student("Rodrigue", 10,98.5));
        students.add(new Student("Rod", 20,58.5));
        students.add(new Student("Bobo", 30,68.5));
        students.add(new Student("Alane", 40,78.5));
        students.add(new Student("Toto", 50,88.5));
        students.add(new Student("Rene", 15,98.5));
        System.out.print("Students details: ");
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()));

        for (Student student : students){
            System.out.println("\n" + student);
        }
            printTopStudent(students);
            printAverageAndTotal(students);
    }
    public static void printTopStudent (ArrayList <Student> list){
        {
            System.out.println("Top student " + list.get(0));
           System.out.println("Bottom Student" + list.get(list.size()-1));
        }
    }
    public static void printAverageAndTotal (ArrayList <Student> list){
        double total = 0;
        for (Student grade : list ){
            total += grade.getGrade();
        }
        System.out.println("The average is" + (total / list.size()));
        System.out.println("The cumulative total is: " + total);
    }
}
