import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {
        int[] scores = {78, 45, 92, 60, 88, 33, 95};
        int target = 60;

     
        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

       
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Copy:    " + Arrays.toString(sortedScores));

        
}
