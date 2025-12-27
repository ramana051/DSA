public class PluseOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        PluseOne pluseOne = new PluseOne();
        int[] digits = {9, 9, 9};
        int[] result = pluseOne.plusOne(digits);
        
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit);
        }
    }
}