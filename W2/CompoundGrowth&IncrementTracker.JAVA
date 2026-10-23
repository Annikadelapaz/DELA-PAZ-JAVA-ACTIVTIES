public class CompoundGrowthTracker {
    public static void main(String[] args) {
        // Requirement 1: Starting from initial balance, apply += and *= at least 3 times
        double balance = 1000.0;
        System.out.println("Initial Balance: " + balance);

        balance += 500; // deposit 500
        System.out.println("After deposit (+= 500): " + balance);

        balance *= 1.10; // 10% growth / interest
        System.out.println("After 10% growth (*= 1.10): " + balance);

        balance += 200; // another deposit
        System.out.println("After second deposit (+= 200): " + balance);

        balance *= 1.05; // 5% growth
        System.out.println("After 5% growth (*= 1.05): " + balance);

        System.out.println("\n--- Increment Demo ---");

        // Requirement 2: counter with postfix
        int count = 5;
        System.out.println("Initial count: " + count);
        
        System.out.println("Printing count++ inside println(): " + count++);
        System.out.println("Printing count again immediately after: " + count);

        // Requirement 3: counter with prefix
        System.out.println("\nPrinting ++count inside println(): " + ++count);
        System.out.println("Printing count again immediately after: " + count);

        /*
         * EXPLANATION WHY THE TWO PRINTED VALUES DIFFER:
         * count++ is POSTFIX: it returns the OLD value first, then increments.
         *   So System.out.println(count++) prints 5, then count becomes 6.
         * ++count is PREFIX: it increments FIRST, then returns the NEW value.
         *   So System.out.println(++count) increments count to 7 first, then prints 7.
         * That's why postfix shows 5 then 6, while prefix shows 7 then 7.
         */
    }
}
