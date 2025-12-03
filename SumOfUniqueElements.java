import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                sum += m.getKey();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfUniqueElements solver = new SumOfUniqueElements();
        int[] nums = {1, 2, 3, 2};
        int result = solver.sumOfUnique(nums);
        System.out.println("Sum of unique elements: " + result);
    }
}
