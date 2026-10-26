public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
        int size = 5;
        
        System.out.println("--- Right-Triangle Pattern with Break & Continue ---");
        
        for (int i = 1; i <= size; i++) {
          
            if (i == 3) {
                System.out.println("Row " + i + " skipped using continue.");
                continue; 
            }
            
            for (int j = 1; j <= size; j++) {
            
                if (i == 4 && j > 2) {
                    break; 
                }
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
