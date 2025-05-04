package SHOPING;

public class ItemToPurchase {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public ItemToPurchase(){
        this.itemName = "Unknown";
        this.itemPrice = 0.0;
        this.itemQuantity = 0;
    }
    public ItemToPurchase(String itemName, double itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }


    @Override
    public String toString() {
        return
                "Name: " + itemName  + "\n" +
                "Price: " + itemPrice + "\n" +
                "Quantity: " + itemQuantity + "\n";
    }
}