import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to count frequency: ");
        int key = sc.nextInt();
        int freq = 0;
        for (int val : arr) {
            if (val == key) freq++;
        }
        System.out.println("Frequency of " + key + " is " + freq);
        sc.close();
    }
}