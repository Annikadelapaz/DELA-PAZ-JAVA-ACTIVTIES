import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Combine searching and sorting on the same array of data[span_0](start_span)[span_0](end_span)
        int[] scores = {85, 92, 78, 90, 65, 88, 95, 72};
        int target = 90;

        // Using the same scores array, implement a linear search for a specific target value, printing whether it was found and at what index[span_1](start_span)[span_1](end_span)
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

        // Sort a COPY of the array using Arrays.sort(), then print both the original and sorted versions[span_2](start_span)[span_2](end_span)
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original array: " + Arrays.toString(scores));
        System.out.println("Sorted copy: " + Arrays.toString(sortedScores));

        // Explain in a comment why sorting a copy (rather than the original) might matter here[span_3](start_span)[span_3](end_span)
        /* 
         * Why sorting a copy rather than the original matters here:
         * 1. Preserving original order: If other parts of the program rely on the 
         *    original arrangement or indices of the data (such as specific student IDs 
         *    mapped to these indices), mutating the original array would corrupt that reference.
         * 2. Maintaining linear search results: If a linear search depends on original 
         *    positioning or history, sorting in place would alter index locations.
         */

    }
}
