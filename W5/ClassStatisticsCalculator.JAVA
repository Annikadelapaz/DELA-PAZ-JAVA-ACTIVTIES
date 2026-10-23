public class Main {
    public static void main(String[] args) {
        
        // Process an array of scores to compute several summary statistics[span_0](start_span)[span_0](end_span)
        // Declare an int array of at least 8 student scores[span_1](start_span)[span_1](end_span)
        int[] scores = {85, 92, 78, 90, 65, 88, 95, 72};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Using loops (not built-in shortcuts), compute the sum, average, highest score, and lowest score[span_2](start_span)[span_2](end_span)
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            
            if (scores[i] > highest) {
                highest = scores[i];
            }
            
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        // Print all four statistics with clear labels[span_3](start_span)[span_3](end_span)
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

    }
}
