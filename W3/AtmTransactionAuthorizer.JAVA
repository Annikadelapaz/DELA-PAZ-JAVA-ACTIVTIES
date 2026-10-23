public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        // --- Test Data ---
        String inputUsername = "john_doe";
        int inputPin = 1234;
        double balance = 25000.00;
        double withdrawalAmount = 8000.00;

        // --- Stored Data ---
        String correctUsername = "john_doe";
        int correctPin = 1234;

        // Requirement 1: Nested if to check username AND 4-digit PIN
        if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin && inputPin >= 1000 && inputPin <= 9999) {
                
                // Requirement 2: else-if ladder to determine tier from balance
                String tier;
                if (balance < 5000) {
                    tier = "Bronze";
                } else if (balance < 20000) {
                    tier = "Silver";
                } else if (balance < 50000) {
                    tier = "Gold";
                } else {
                    tier = "Platinum";
                }
                System.out.println("Tier determined: " + tier);

                // Requirement 4: switch on tier to select fee percentage
                double feePercent;
                switch (tier) {
                    case "Bronze":
                        feePercent = 0.02;
                        break;
                    case "Silver":
                        feePercent = 0.015;
                        break;
                    case "Gold":
                        feePercent = 0.01;
                        break;
                    case "Platinum":
                        feePercent = 0.005;
                        break;
                    default:
                        feePercent = 0.02;
                }

                double fee = withdrawalAmount * feePercent;
                double totalDebit = withdrawalAmount + fee;

                // Requirement 3: nested if for withdrawal - sufficient balance AND tier-dependent daily limit
                int dailyLimit;
                switch (tier) {
                    case "Bronze": dailyLimit = 5000; break;
                    case "Silver": dailyLimit = 10000; break;
                    case "Gold": dailyLimit = 20000; break;
                    case "Platinum": dailyLimit = 50000; break;
                    default: dailyLimit = 0;
                }

                // Final APPROVE/DENY with exact reason
                if (totalDebit <= balance) {
                    if (withdrawalAmount <= dailyLimit) {
                        System.out.println("APPROVED: Withdrawal of " + withdrawalAmount + 
                                           " + fee " + fee + " = " + totalDebit);
                        System.out.println("New Balance: " + (balance - totalDebit));
                    } else {
                        System.out.println("DENY: Exceeds daily limit for " + tier + " (" + dailyLimit + ")");
                    }
                } else {
                    System.out.println("DENY: Insufficient balance. Needed " + totalDebit + ", Available " + balance);
                }

            } else {
                System.out.println("DENY: Invalid PIN. Must be correct 4-digit PIN.");
            }
        } else {
            System.out.println("DENY: Invalid username.");
        }
    }
}
