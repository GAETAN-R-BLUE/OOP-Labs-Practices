package LIbrary;

import MyEmployees.Employee;

public class Book {
    //Declare all the private variables for the library package
    private String bookTitle;
    private  String author;
    private int year;
    boolean availability;

    // Setting my default constructor
    public Book (){
        this.bookTitle = "";
        this.author = "";
        this.year = 0;
        this.availability= true;
    }
   // Setting the constructor for my variable for proper encapsulation
    public Book(String bookTitle, String author, int year, boolean availability) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.availability = availability;
    }
// Setting the setter and the getter for all my variables
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Method that check if a book is available
    public boolean checkOut(){
        isAvailability();
        return true;
    }
    // Method that check if a book has been returned
    public boolean returnBook (){
        isAvailability();
        return false;
    }

    @Override
    public String toString() {
        return "=== List Of Books In The Library ===" +
                "BookTitle: " + bookTitle + '\n' +
                "Author: " + author + '\n' +
                "Year: " + year + "\n" +
                "Availability=" + availability;
    }
}
