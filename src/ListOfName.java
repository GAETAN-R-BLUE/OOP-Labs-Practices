import java.util.ArrayList;
import java.util.Scanner;

public class ListOfName {
    public static void main(String[] args) {
        System.out.println("Enter all the names separated by space:");
        String[] userInput = new Scanner(System.in).nextLine().split(" ");

        // Store names in ArrayList
        ArrayList<String> names = new ArrayList<>();
        for (String name : userInput) {
            names.add(name);
        }
        // Print all names and total count
        printNames(names);
    }
    // Method that prints each name and total number of names
    public static void printNames(ArrayList<String> nameList) {
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("Total names: " + nameList.size());
    }
}