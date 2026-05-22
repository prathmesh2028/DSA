package Arrays.Basic;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("Enter the array element : ");
            arr[i] = sc.nextInt();
        }





        int sum = 0;
        for(int i = 0 ; i < size ; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of all elements of array is : " + sum);
    }
}
