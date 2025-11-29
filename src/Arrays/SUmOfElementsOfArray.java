package Arrays;

import java.util.Scanner;

public class SUmOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array...");
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the element at index " + i + " :");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        System.out.println("The sum of the all elements of the array is :" + sum);
    }
}
