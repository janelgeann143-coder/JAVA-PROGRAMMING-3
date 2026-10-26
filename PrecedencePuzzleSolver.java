public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
       
        boolean result1 = 5 + 3 < 4;
        System.out.println("Result 1: " + result1);

        
        int x = 5;
        int result2 = x++ * 2 + 2;
        System.out.println("Result 2: " + result2);

        
        boolean result3 = true || false && false;
        System.out.println("Result 3: " + result3);
    }
}
