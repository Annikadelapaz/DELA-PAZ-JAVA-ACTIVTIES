public class NestedLoginValidator {
    public static void main(String[] args) {
        // Stored credentials
        String correctUsername = "admin";
        String correctPassword = "pass123";
        boolean isLocked = false; // 3rd condition: account not locked

        // Change these values to test all failure paths
        String username = "admin";
        String password = "pass123";

        // Level 1: Check username first
        if (username.equals(correctUsername)) {
            
            // Level 2: Only if username matches, check password
            if (password.equals(correctPassword)) {
                
                // Level 3: Only if BOTH match, check third condition
                if (!isLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Failed: Account is locked.");
                }
                
            } else {
                System.out.println("Failed: Incorrect password.");
            }
            
        } else {
            System.out.println("Failed: Username not found.");
        }
    }
}
