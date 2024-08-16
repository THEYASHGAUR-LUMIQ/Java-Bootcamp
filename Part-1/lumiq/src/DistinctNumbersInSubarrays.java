
import java.util.HashMap;

public class DistinctNumbersInSubarrays {

    // Method to find the count of distinct numbers in every subarray of size k
    public static void countDistinctNumbers(int[] arr, int k) {
        // HashMap to store the frequency of elements in the current window
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the first k elements and store their frequencies
        for (int i = 0; i < k; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Print the number of distinct elements in the first window
        System.out.print(frequencyMap.size());

        // Traverse the array, starting from the k-th element
        for (int i = k; i < arr.length; i++) {
            // Remove the frequency of the element going out of the window
            int elementToRemove = arr[i - k];
            if (frequencyMap.get(elementToRemove) == 1) {
                frequencyMap.remove(elementToRemove);
            } else {
                frequencyMap.put(elementToRemove, frequencyMap.get(elementToRemove) - 1);
            }

            // Add the frequency of the new element coming into the window
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);

            // Print the number of distinct elements in the current window
            System.out.print(", " + frequencyMap.size());
        }
    }

    public static void main(String[] args) {
        // Test case
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        // Call the method and print the output
        System.out.print("Output: ");
        countDistinctNumbers(arr, k);
    }
}
