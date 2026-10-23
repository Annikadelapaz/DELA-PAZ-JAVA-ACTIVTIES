public class MyClass {
  public static void main(String args[]) {
      String storeName = "Dela Paz's ShopnStop";
      
    int quantity = 1;
    double unitPrice = 168.99;

    /*
         * totalCost must be a double (or floating-point type) rather than an int 
         * because multiplying an int by a double produces a double. Declaring totalCost 
         * as an int would cause a compilation error due to type mismatch, or loss of 
         * fractional precision (cents) if cast to an integer.
         */
        double totalCost = quantity * unitPrice;

        System.out.println("--- Purchase Summary ---");
        System.out.println("Store Name:  " + storeName);
        System.out.println("Quantity:    " + quantity);
        System.out.println("Unit Price:  ₱" + unitPrice);
        System.out.println("Total Cost:  ₱" + totalCost);
    }
}
