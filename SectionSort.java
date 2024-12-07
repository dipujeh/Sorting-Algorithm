import java.util.Scanner;

public class SectionSort {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the array:");

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) { // Inner loop
                if (arr[j] < arr[smallest]) {
                    // Swap elements
                    smallest  = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }

        // Print sorted elements
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 