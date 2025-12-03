import java.util.*;
public class SelftDividingOrNot {
    public static boolean isSelfDividing(int number) {
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || originalNumber % digit != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left=1;
        int right=22;
        List<Integer> list = new ArrayList<>();
        for (int number = left; number <= right; number++) {
            if (isSelfDividing(number)) {
                list.add(number);
            } 
        }
        System.out.println("Self-dividing numbers between " + left + " and " + right + ": " + list);
    }
}
