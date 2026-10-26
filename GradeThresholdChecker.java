public class Main {
    public static void main(String[] args) {

        double average = 85;
        int absences = 2;

        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("Reason: You meet the grade and attendance requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: You did not meet the grade and attendance requirements.");
        }
    }
}
