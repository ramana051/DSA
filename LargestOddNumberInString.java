public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if ((digit - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num = "35427";
        String largestOdd = largestOddNumber(num);
        System.out.println("Largest odd number substring: \"" + largestOdd + "\"");
    }
}
