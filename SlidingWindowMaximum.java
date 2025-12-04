public class SlidingWindowMaximum {
    // static int large(int arr[],int s,int e){
    //     int large=Integer.MIN_VALUE;
    //     for(int i=s;i<=e;i++){
    //         if(arr[i]>large){
    //             large=arr[i];
    //         }
    //     }
    //     return large;
    // }
    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     int result[]=new int[nums.length-(k-1)];
    //     int start=0;
    //     int end=k-1;
    //     for(int i =0;end<nums.length;i++){
    //         result[i]=large(nums,start,end);
    //         start++;
    //         end++;
    //     }
    //     return result;
    // }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            if (maxIndex < i) {
                maxIndex = i;
                maxValue = nums[i];
                for (int j = i; j < i + k; j++) {
                    if (nums[j] > maxValue) {
                        maxValue = nums[j];
                        maxIndex = j;
                    }
                }
            } else if (nums[i + k - 1] >= maxValue) {
                maxValue = nums[i + k - 1];
                maxIndex = i + k - 1;
            }
            result[i] = maxValue;
        }
        return result;
    }
    public static void main(String[] args) {
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = swm.maxSlidingWindow(nums, k);
        System.out.print("Sliding window maximums: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
