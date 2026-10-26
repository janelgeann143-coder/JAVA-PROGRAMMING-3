public class Main {
    public static void main(String[] args) {

        
        int quantity = 3;
        double unitPrice = 49.99;
        String storeName = "Aling Bebang Store";

        
        double totalCost = quantity * unitPrice;

      
        System.out.println("===== " + storeName + " =====");
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: ₱" + unitPrice);
        System.out.println("Total Cost: ₱" + totalCost);
    }
}
