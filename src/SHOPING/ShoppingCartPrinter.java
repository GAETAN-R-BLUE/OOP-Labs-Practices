package SHOPING;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the quantity of your items ");
        int itemCount = userInput.nextInt();
        ItemToPurchase[] itemList = new ItemToPurchase[userInput.nextInt()];

        double total = 0;
        userInput.nextLine();

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item " + (i + 1));

            System.out.println("Enter the item name");
            ItemToPurchase item = new ItemToPurchase();
            item.setItemName(userInput.nextLine());

            System.out.println("Enter the item quantity");
            item.setItemQuantity(userInput.nextInt());

            System.out.println("Enter the item price");
            item.setItemPrice(userInput.nextDouble());
            userInput.nextLine();

            itemList[i] = item;
            total += item.getItemPrice() * item.getItemQuantity();
            System.out.println();
        }
        System.out.println("TOTAL COAST");
        for (ItemToPurchase item : itemList) {
            System.out.println(item.getItemName() + " " + item.getItemQuantity() + " @ $" + item.getItemPrice() + " = $" + item.getItemPrice() * item.getItemQuantity());
        }
        System.out.println("\nTotal: $" + total);

    }
}
