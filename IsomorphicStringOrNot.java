import java.util.Scanner;
import java.util.HashMap;
public class IsomorphicStringOrNot {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // int[] map1 = new int[256];
        // int[] map2 = new int[256];

        // for (int i = 0; i < str1.length(); i++) {
        //     char char1 = str1.charAt(i);
        //     char char2 = str2.charAt(i);

        //     if (map1[char1] != map2[char2]) {
        //         return false;
        //     }

        //     map1[char1] = i + 1;
        //     map2[char2] = i + 1;
        // }

        // return true;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char original = str1.charAt(i);
            char replacement = str2.charAt(i);
            if (!map.containsKey(original)) {
                if (!map.containsValue(replacement)) {
                    map.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char duplicate = map.get(original);
                if (duplicate != replacement)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // String str1 = "egg";
        // String str2 = "add";
        // String str1 = "foo";
        // String str2 = "bar";

        boolean result = areIsomorphic(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" isomorphic? " + result);
        scanner.close();
    }
}