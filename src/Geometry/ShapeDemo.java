package Geometry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Scanner userInput = new Scanner(System.in);
        int count = 0;

        while (true) {
            try {
                System.out.println(" \n 1. Add a circle \n 2. Add a Rectangle \n 3. Add a Triangle \n 4. Display all shapes \n 5. Exit");
                int choice = userInput.nextInt();

                switch (choice) {

                    case 1: {
                        userInput.nextLine();
                        System.out.println("Enter the circle name");
                        String name = userInput.nextLine();
                        System.out.println("Enter the circle color");
                        String color = userInput.nextLine();
                        System.out.println("Enter the circle radius");
                        double radius = userInput.nextDouble();
                        Circle newCircle = new Circle(name, color, radius);
                        shapes[count] = newCircle;
                        count++;

                        break;
                    }
                    case 2: {
                        userInput.nextLine();
                        System.out.println("Enter the Rectangle name");
                        String name = userInput.nextLine();
                        System.out.println("Enter the Rectangle color");
                        String color = userInput.nextLine();
                        System.out.println("Enter the length");
                        double length = userInput.nextDouble();
                        System.out.println("Enter the width");
                        double width = userInput.nextDouble();

                        Rectangle newRectangle = new Rectangle(name, color, length, width);
                        shapes[count] = newRectangle;
                        count++;
                        break;
                    }
                    case 3: {
                        userInput.nextLine();
                        System.out.println("Enter the Triangle name");
                        String name = userInput.nextLine();
                        System.out.println("Enter the Triangle color");
                        String color = userInput.nextLine();
                        System.out.println("Side 1");
                        double side1 = userInput.nextDouble();
                        System.out.println("Side 2");
                        double side2 = userInput.nextDouble();
                        System.out.println("Side 3");
                        double side3 = userInput.nextDouble();

                        Triangle newTriangle = new Triangle(name, color, side1, side2, side3);
                        shapes[count] = newTriangle;
                        count++;

                        break;
                    }
                    case 4: {
                        for (int i = 0; i < shapes.length; i++) {
                            System.out.println(shapes[i] + "\nArea = " + shapes[i].area() + "\nPerimeter = " + shapes[i].perimeter());
                        }
                        break;
                    }
                    case 5: {
                        return;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                userInput.nextLine();

            }
        }
    }
}


