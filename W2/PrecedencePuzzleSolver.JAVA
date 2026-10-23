public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        
        // Expression 1: Arithmetic + Relational + Logical + Postfix/Prefix
        int a = 5;
        int b = 10;
        // PREDICTED: true - I thought (a * 2) = 10 > 5 is true and ++b = 11 > 12 is false, but && will be true because of left to right
        boolean result1 = a++ * 2 > b / 2 && ++b > 12;
        System.out.println("Expression 1: a++ * 2 > b / 2 && ++b > 12");
        System.out.println("Actual: " + result1 + " | a=" + a + ", b=" + b);
        // FOLLOW-UP: Prediction was WRONG. I missed two rules:
        // 1. Postfix a++ uses old value (5) for * first, then increments.
        // 2. Arithmetic (*, /) has higher precedence than Relational (>), which has higher precedence than Logical (&&). So true && false = false.

        System.out.println("---");

        // Expression 2: Arithmetic % + Relational == + Logical || && + Postfix
        int x = 8;
        int y = 3;
        // PREDICTED: true
        boolean result2 = x % y + 1 == 3 || y++ > 2 && x-- < 10;
        System.out.println("Expression 2: x % y + 1 == 3 || y++ > 2 && x-- < 10");
        System.out.println("Actual: " + result2 + " | x=" + x + ", y=" + y);
        // FOLLOW-UP: Prediction was CORRECT. % has same precedence as * / and higher than +, so (8%3)+1 = 3. 3==3 is true. 
        // Because || short-circuits, if left is true, right side is not evaluated. Also && has higher precedence than ||.

        System.out.println("---");

        // Expression 3: Arithmetic - * + Logical ! && || + Prefix/Postfix
        int m = 10;
        int n = 5;
        // PREDICTED: false
        boolean result3 = m++ - --n * 2 <= 0 || !(m > n) && n++ == 4;
        System.out.println("Expression 3: m++ - --n * 2 <= 0 || !(m > n) && n++ == 4");
        System.out.println("Actual: " + result3 + " | m=" + m + ", n=" + n);
        // FOLLOW-UP: Prediction was CORRECT. Precedence order is: prefix --n, then * , then - , then relational <= and >, then ! , then &&, then ||.
        // Evaluation: 10 - (4*2) = 2 <=0 is false, !(11>4) is false, so false || (false && true) = false.
    }
}
