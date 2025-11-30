import java.util.Scanner;
public class secondLargestElement {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int large = Integer.MIN_VALUE;
            
            int second = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>large){
                    second=large;
                    large=arr[i];
                }else if(arr[i]>second && arr[i]!=large){
                    second=arr[i];
                }
            }
            System.out.println("Second largest element is: " + second);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
