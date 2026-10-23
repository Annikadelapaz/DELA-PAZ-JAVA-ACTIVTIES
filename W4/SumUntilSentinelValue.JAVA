import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Use a while loop to keep accumulating input until a special stop value is entered.[span_0](start_span)[span_0](end_span)
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        System.out.println("Enter integers (enter -1 to stop, can include other negative numbers like -5):");
        
        // Use a while loop that keeps reading integers and adding them to a running total[span_1](start_span)[span_1](end_span)
        // Test with an input sequence that includes at least one negative number OTHER than -1[span_2](start_span)[span_2](end_span)
        int number = scanner.nextInt();
        
        // Stop reading the instant the value -1 is entered, without including it in the total[span_3](start_span)[span_3](end_span)
        while (number != -1) {
            total += number;
            number = scanner.nextInt();
        }
        
        // Print the final total once the loop ends[span_4](start_span)[span_4](end_span)
        System.out.println("Final total: " + total);
        
        scanner.close();
    }
}
