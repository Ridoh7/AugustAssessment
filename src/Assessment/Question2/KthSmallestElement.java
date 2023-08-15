package Assessment.Question2;

import java.util.Arrays;

public class KthSmallestElement {
    public static int findKthSmallest(int[] arr, int k) {
            if (k < 1 || k > arr.length) {
                throw new IllegalArgumentException("k is out of bounds");
            }

            Arrays.sort(arr);

            return arr[k - 1];
        }

        public static void main(String[] args) {
            int[] arr = {7, 4, 6, 3, 9, 1};
            int k = 3;

            System.out.println("Input:");
            System.out.println("arr = " + Arrays.toString(arr));
            System.out.println("k = " + k);

            int kthSmallest = findKthSmallest(arr, k);

            System.out.println("\nOutput:");
            System.out.println("k'th smallest array element is " + kthSmallest);
        }
}
