public class ClassRankingSystem {

    
    static class Student {
        String name;
        double[] quizzes;
        double average;
        int rank;

        public Student(String name, double[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
            this.average = calculateAverage();
        }

        private double calculateAverage() {
            double sum = 0;
            for (double score : quizzes) {
                sum += score;
            }
            return sum / quizzes.length;
        }
    }

    public static void main(String[] args) {
      
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        double[][] rawQuizData = {
            {85.0, 90.0, 92.0, 88.0},
            {70.0, 75.0, 80.0, 78.0},
            {95.0, 92.0, 96.0, 94.0},
            {85.0, 90.0, 92.0, 88.0}, 
            {60.0, 65.0, 70.0, 68.0}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

       
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

      
        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average == students[i - 1].average) {
                students[i].rank = students[i - 1].rank; // Same rank if averages are equal
            } else {
                students[i].rank = currentRank;
            }
            currentRank++;
        }

      
        System.out.println("==========================================");
        System.out.println("           CLASS LEADERBOARD              ");
        System.out.println("==========================================");
        System.out.printf("%-6s %-12s %-10s\n", "Rank", "Name", "Average");
        System.out.println("------------------------------------------");
        for (Student s : students) {
            System.out.printf("%-6d %-12s %-10.2f\n", s.rank, s.name, s.average);
        }
        System.out.println("==========================================");

    
        String searchTarget = "Alice";
        int studentRankResult = findStudentRank(students, searchTarget);
        if (studentRankResult != -1) {
            System.out.println("\nLinear Search Result: " + searchTarget + " is at Rank " + studentRankResult);
        } else {
            System.out.println("\nStudent not found.");
        }
    }

   
    public static int findStudentRank(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                return students[i].rank;
            }
        }
        return -1; // Not found
    }
}
