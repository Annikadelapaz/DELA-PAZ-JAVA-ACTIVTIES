public class Main {
    public static void main(String[] args) {
        
        // Store and print a small list of personal favorites using a single-dimensional array[span_0](start_span)[span_0](end_span)
        // Declare and initialize a String array with 5 of your favorite things[span_1](start_span)[span_1](end_span)
        String[] favorites = {"Music", "Gaming", "Cleaning", "Reading", "Singing"};

        // Print each item numbered (1 through 5) using a loop[span_2](start_span)[span_2](end_span)
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        // Print the array's total length using .length[span_3](start_span)[span_3](end_span)
        System.out.println("Total length: " + favorites.length);

    }
}
