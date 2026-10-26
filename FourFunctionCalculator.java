import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 10;
        int num2 = 3;

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + ((double) num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
            System.out.println("Modulus: Cannot divide by zero.");
        }

        

        input.close();
    }
}
