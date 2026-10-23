public class Main {
    public static void main(String[] args) {
        
        // Use a for loop to print a sequence of numbers alongside their squares[span_0](start_span)[span_0](end_span)
        // Use a for loop to count from 1 to 10 (or change bound to 20 as required)[span_1](start_span)[span_1](end_span)
        int bound = 20; // Change the loop bound to 20 and confirm output updates correctly[span_2](start_span)[span_2](end_span)
        
        for (int i = 1; i <= bound; i++) {
            // For each number, print the number and its square on the same line, clearly labeled[span_3](start_span)[span_3](end_span)
            System.out.println("Number: " + i + ", Square: " + (i * i));
        }

    }
}
