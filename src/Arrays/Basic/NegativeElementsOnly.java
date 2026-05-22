package Arrays.Basic;

import java.util.Scanner;

public class NegativeElementsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the element in array :");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}
