import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Represent a warehouse as a 2D array of item counts, using -1 to mean a damaged shelf[span_0](start_span)[span_0](end_span)
        int[][] warehouse = {
            {10, 2, 15},
            {-1, 20, 8},
            {3, 12, 25}
        };

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Use a do-while driven menu that runs until the user chooses to exit[span_1](start_span)[span_1](end_span)
        do {
            System.out.println("\n--- Warehouse Inventory Scanner ---");
            System.out.println("1. Total Inventory (skipping damaged shelves)");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Restock Shelf");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                // Use a for loop with continue to total inventory while skipping damaged shelves[span_2](start_span)[span_2](end_span)
                int total = 0;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] == -1) {
                            continue; // skip damaged shelf
                        }
                        total += warehouse[i][j];
                    }
                }
                System.out.println("Total inventory count (excluding damaged shelves): " + total);

            } else if (choice == 2) {
                // Use nested loops with break to find the first critically low shelf[span_3](start_span)[span_3](end_span)
                boolean found = false;
                int threshold = 5; // definition of critically low
                
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] != -1 && warehouse[i][j] < threshold) {
                            System.out.println("First critically low shelf found at Row " + i + ", Column " + j + " with count: " + warehouse[i][j]);
                            found = true;
                            break; // breaks out of inner loop
                        }
                    }
                    if (found) {
                        break; // breaks out of outer loop
                    }
                }
                if (!found) {
                    System.out.println("No critically low shelves found.");
                }

            } else if (choice == 3) {
                // Use a while loop plus return to simulate restocking with input validation[span_4](start_span)[span_4](end_span)
                simulateRestock(scanner, warehouse);

            } else if (choice == 4) {
                System.out.println("Exiting system.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    // Use a while loop plus return to simulate restocking with input validation[span_5](start_span)[span_5](end_span)
    public static void simulateRestock(Scanner scanner, int[][] warehouse) {
        System.out.print("Enter shelf row index (0-2): ");
        int row = scanner.nextInt();
        System.out.print("Enter shelf column index (0-2): ");
        int col = scanner.nextInt();

        if (row < 0 || row >= warehouse.length || col < 0 || col >= warehouse[0].length) {
            System.out.println("Invalid shelf coordinates!");
            return;
        }

        if (warehouse[row][col] == -1) {
            System.out.println("Error: Cannot restock a damaged shelf (-1)!");
            return;
        }

        // Input validation using a while loop
        while (true) {
            System.out.print("Enter quantity to add (must be greater than 0): ");
            int amount = scanner.nextInt();
            
            if (amount > 0) {
                warehouse[row][col] += amount;
                System.out.println("Restock successful! New item count on shelf: " + warehouse[row][col]);
                return; // returns from the method
            }
            
            System.out.println("Invalid amount. Try again.");
        }
    }
}
