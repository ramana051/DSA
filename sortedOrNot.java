public class sortedOrNot {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        if (isSorted(array)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
