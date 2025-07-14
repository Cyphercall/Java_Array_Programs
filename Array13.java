import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        System.out.print("Copied array elements: ");
        for (int val : arr2) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}