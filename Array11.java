import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
        System.out.print("Array after replacing negatives with zero: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}