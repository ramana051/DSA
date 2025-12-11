public class ShuffleTheArray {
     public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int left = 0;
        int right = n;
        int i = 0;
        while (right < nums.length) {
            arr[i] = nums[left];
            arr[i + 1] = nums[right];
            left++;
            right++;
            i += 2;
        }
        return arr;
    }
    public static void main(String[] args) {
        ShuffleTheArray obj = new ShuffleTheArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = obj.shuffle(nums, n);
        
        System.out.print("Shuffled Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
