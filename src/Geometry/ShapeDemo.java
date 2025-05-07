package Geometry;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
    Shape [] shapes = new Shape[5];
        Scanner userInput = new Scanner(System.in);
        while (true){
            System.out.println(" \n 1. Add a circle \n 2. Add a Rectangle \n 3. Add a Triangle \n 4. Display all shapes \n 5. Exit");
            int choice = userInput.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the circle name");
                    String name = userInput.nextLine();
                    System.out.println("Enter the circle color");
                    String color = userInput.nextLine();
                    System.out.println("Enter the circle radius");
                    double radius = userInput.nextDouble();


                  break;
                }
                case 2:{
                    System.out.println("Enter the Rectangle name");
                    String name = userInput.nextLine();
                    System.out.println("Enter the Rectangle color");
                    String color = userInput.nextLine();
                    System.out.println("Enter the length");
                    double length = userInput.nextDouble();
                    System.out.println("Enter the width");
                    double width =userInput.nextDouble();
                  break;
                }
                case 3:{
                    System.out.println("Enter the Rectangle name");
                    String name = userInput.nextLine();
                    System.out.println("Enter the Rectangle color");
                    String color = userInput.nextLine();
                    System.out.println("Side 1");
                    double side1 = userInput.nextDouble();
                    System.out.println("Side 2");
                    double side2 = userInput.nextDouble();
                    System.out.println("Side 3");
                    double side3 = userInput.nextDouble();
                  break;
                }
                case 4:{
                    System.out.println("=== Shapes in memory ===");

                  break;
                }
                case 5:{
                return;
                }

            }
        }
    }
}
