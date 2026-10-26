public class Main {
    public static void main(String[] args) {

       
        double centimeters = 175.8;

       
        int meters = (int) (centimeters / 100);

        
        double remainingCentimeters = centimeters - (meters * 100);

     
        System.out.println("=== Unit Casting Converter ===");
        System.out.println("Centimeters: " + centimeters + " cm");
        System.out.println("Whole meters: " + meters + " m");
        System.out.println("Remaining centimeters: " + remainingCentimeters + " cm");

        
        int number = 25;
        double widenedNumber = number;

        System.out.println("\n=== Implicit Widening ===");
        System.out.println("Integer value: " + number);
        System.out.println("Double value: " + widenedNumber);

        
        double decimalNumber = 12.75;
        int narrowedNumber = (int) decimalNumber;

        System.out.println("\n=== Explicit Narrowing ===");
        System.out.println("Original double: " + decimalNumber);
        System.out.println("Converted integer: " + narrowedNumber);
    }
}
