public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int arr[]= new int[2*nums.length];
        int n= nums.length;
        for(int i =0;i<n;i++){
            arr[i]=nums[i];
            arr[n+i]=nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        ConcatenationOfArray obj = new ConcatenationOfArray();
        int[] nums = {1, 2, 3};
        int[] result = obj.getConcatenation(nums);
        
        System.out.print("Concatenated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
