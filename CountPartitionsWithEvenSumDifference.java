public class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        long sum=0;
        for(int num:nums) sum+=num;
        return (sum%2==0) ? nums.length-1 : 0;
    }
    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference cp = new CountPartitionsWithEvenSumDifference();
        int[] nums = {10,10,3,7,6};
        // int[] nums = {1,2,2};
        int result = cp.countPartitions(nums);
        System.out.println("Number of partitions with even sum difference: " + result);
    }
}
