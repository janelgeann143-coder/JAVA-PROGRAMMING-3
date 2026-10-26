public class SimpleGradeClassifier {
    public static void main(String[] args) {
       
        int score = 75; 

        System.out.println("Testing score: " + score);

       
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

       
        System.out.println("\n--- Testing second value ---");
        score = 45;
        System.out.println("Testing score: " + score);
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
