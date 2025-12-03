public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 != 0) {
                if (nums[right] % 2 == 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 3,5,6,2,0, 1, 2, 4 };
        int[] sortedArray = sortArrayByParity(nums);
        System.out.print("Sorted array by parity: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
