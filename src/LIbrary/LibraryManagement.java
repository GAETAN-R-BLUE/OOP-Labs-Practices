/* *****************************************************************************
 * This program is an implementation of a library system to mage books using the
 * following java collections: ArrayList, HashMap, HashTree, HashSet etc...
 * Date: 01:01:1111
 * *****************************************************************************/
package LIbrary;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            //Try-catch to handle exceptions
            try {
                System.out.println("\n 1. Add book \n " +
                        "2. View all books \n " +
                        "3. Search for a book title\n " +
                        "4. Check out a book " +
                        "5. Return a book \n " +
                        "6. Sort books \n " +
                        "7. View available books only " + "\n " +
                        "8. Exit");
                int choice = userInput.nextInt();

                switch (choice) {
                    // The following implements the add book functionality
                    case 1: {
                        userInput.nextLine();
                        System.out.println("Enter the book's title");
                        String title = userInput.nextLine();
                        System.out.println("Enter the author's name");
                        String author = userInput.nextLine();
                        System.out.println("Enter the year");
                        int year = userInput.nextInt();
                        Book newbook = new Book(title, author, year, true);
                        books.add(newbook);

                        break;
                    }
                    // The following implements the display functionality
                    case 2: {
                        userInput.nextLine();
                        for (Book book : books) {
                            System.out.println(book);
                        }
                        break;
                    }
                   //The following implements the search book functionality (Search by title)
                    case 3: {
                        userInput.nextLine();
                        System.out.println("Enter the book's title");
                        String title = userInput.nextLine();
                        for (Book book : books) {
                            if (title.equals(book.getBookTitle())) {
                                System.out.println(book);
                            }
                        }
                        break;
                    }
                    //The following implement the "Check out a Book" functionality
                    case 4: {
                        userInput.nextLine();
                        System.out.println("Enter the book's title");
                        String title = userInput.nextLine();

                        for (Book book : books) {
                            if (title.equals(book.getBookTitle()) && book.isAvailability()) {
                                System.out.println(book);
                            } else {
                                System.out.println("the book is not available");
                            }
                        }
                        break;
                    }
                    //The following implement the return functionality when checking-in
                    case 5: {
                        userInput.nextLine();
                        System.out.println("Enter the book title to be return");
                        String title = userInput.nextLine();
                        break;
                    }
                    //The following Exit out of the program
                    case 6: {
                        return;
                    }
                }
            }
            //The following is the catch statement in case an invalid entry is entered by the user

            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                userInput.nextLine();
            }
        }
    }
}


