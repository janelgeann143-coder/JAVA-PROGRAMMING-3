public class MultiTierDiscountSystem {
    public static void main(String[] args) {
       
        double purchaseAmount = 150.00; 
        double discountPercentage = 0.0;
        String discountTier = "";

    
        if (purchaseAmount >= 200.0) {
            discountPercentage = 0.15; 
            discountTier = "Tier 3 (15% Off)";
        } else if (purchaseAmount >= 100.0) {
            discountPercentage = 0.10;
            discountTier = "Tier 2 (10% Off)";
        } else if (purchaseAmount >= 50.0) {
            discountPercentage = 0.05; 
            discountTier = "Tier 1 (5% Off)";
        } else {
            discountPercentage = 0.0;  
            discountTier = "Standard (0% Off)";
        }

       
        double discountAmount = purchaseAmount * discountPercentage;
        double finalPrice = purchaseAmount - discountAmount;

       
        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Assigned Discount Tier: " + discountTier);
        System.out.println("Final Discounted Price: $" + finalPrice);
    }
}
