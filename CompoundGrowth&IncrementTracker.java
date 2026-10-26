public class CompoundGrowthTracker {
    public static void main(String[] args) {
        
        double balance = 1000.0;
        System.out.println("Initial Balance: " + balance);

        balance += 250.0; 
        System.out.println("After step 1 (+=): " + balance);

        balance *= 1.05; 
        System.out.println("After step 2 (*=): " + balance);

        balance += 500.0; 
        System.out.println("After step 3 (+=): " + balance);

        System.out.println();

      
        int count = 5;
        System.out.println("--- Postfix Increment (count++) ---");
        System.out.println("Value printed during count++: " + count++); 
        System.out.println("Value printed immediately after: " + count);

        System.out.println();

      
        int countPrefix = 5;
        System.out.println("--- Prefix Increment (++count) ---");
        System.out.println("Value printed during ++count: " + ++countPrefix); 
        System.out.println("Value printed immediately after: " + countPrefix);

     
    }
}
