import java.util.Scanner;

public class SumUntilSentinelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalSum = 0;
        
       
        
        System.out.println("Enter integers to add to the total. Enter -1 to stop.");
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        
        while (input != -1) {
            totalSum += input;
            
            System.out.print("Enter next integer: ");
            input = scanner.nextInt();
        }

        scanner.close();

     
        System.out.println("\nLoop ended. Final Total: " + totalSum);
    }
}
