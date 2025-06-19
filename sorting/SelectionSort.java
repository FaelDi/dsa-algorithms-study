package sorting;

//average: O(n^2), worst: O(n^2), best: O(n^2) since it always goes through the entire array
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        long startTime = System.currentTimeMillis();

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Start time: " + startTime + " ms");
        System.out.println("End time: " + endTime + " ms");
        System.out.println("Duration: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 8, 3, 2};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
