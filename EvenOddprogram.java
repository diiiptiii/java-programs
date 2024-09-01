import java.util.*;
public class EvenOddprogram{
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}