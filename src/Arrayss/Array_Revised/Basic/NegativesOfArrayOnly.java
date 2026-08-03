package Arrayss.Array_Revised.Basic;

import java.util.Scanner;

public class NegativesOfArrayOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        //printing negative values
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}
