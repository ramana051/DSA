public class setMismatchInArray {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int duplicate = -1;
        int missing = -1;

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
    public static void main(String[] args) {
        setMismatchInArray obj = new setMismatchInArray();
        int[] nums = {1, 2, 2, 4};
        int[] result = obj.findErrorNums(nums);
        
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
