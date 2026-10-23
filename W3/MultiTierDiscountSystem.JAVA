public class MultiTierDiscount {
    public static void main(String[] args) {
        // Requirement 1: declare double variable
        double purchaseAmount = 1250.0;

        double discountRate; // will store 0.0, 0.05, 0.10, 0.15

        // Requirement 2: else-if ladder with at least 4 branches
        // IMPORTANT: Check from highest to lowest so no tier is unreachable
        if (purchaseAmount >= 1000) {
            discountRate = 0.15; // 15%
        } else if (purchaseAmount >= 500) {
            discountRate = 0.10; // 10%
        } else if (purchaseAmount >= 100) {
            discountRate = 0.05; // 5%
        } else {
            discountRate = 0.0; // 0%
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discountAmount;

        // Requirement 3: Print both tier and final price
        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount Tier: " + (discountRate * 100) + "%");
        System.out.println("Final Discounted Price: $" + finalPrice);
    }
}
