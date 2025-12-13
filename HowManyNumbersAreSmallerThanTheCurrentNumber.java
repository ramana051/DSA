public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber obj = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = obj.smallerNumbersThanCurrent(nums);
        
        System.out.print("Numbers Smaller Than Current: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
