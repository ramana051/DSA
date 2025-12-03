import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray finder = new FindAllNumbersDisappearedInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = finder.findDisappearedNumbers(nums);
        System.out.println("Disappeared numbers: " + disappearedNumbers);
    }
}
