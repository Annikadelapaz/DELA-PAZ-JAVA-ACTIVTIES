public class Main {
    public static void main(String[] args) {
        
        // Use nested loops to print a right-triangle or square pattern of a given size[span_0](start_span)[span_0](end_span)
        int size = 5;
        
        for (int i = 1; i <= size; i++) {
            
            // Add a separate condition using continue to skip printing one specific row or column value[span_1](start_span)[span_1](end_span)
            // Demonstrates continue: skips row 2 entirely
            if (i == 2) {
                continue; 
            }
            
            for (int j = 1; j <= size; j++) {
                
                // Add a condition that uses break to stop the INNER loop early once a specific value or position is reached[span_2](start_span)[span_2](end_span)
                // Demonstrates break: stops the inner loop early when column reaches 4
                if (j == 4) {
                    break; 
                }
                
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
