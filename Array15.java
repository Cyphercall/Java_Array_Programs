import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Array too small to swap");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        System.out.print("Array after swapping first and last elements: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}