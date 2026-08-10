package Arrayss.Array_Revised.Two_D_Array;

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
        int[][] arr = {{1,1,1,1} , {2,2,2,2} , {3,3,3,3}};
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for array : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of for array : ");
        int cols = sc.nextInt();
        System.out.println();

        System.out.println("Give inout for 2D array ");
        int[][] arrr = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < arrr[0].length ; j++)
            {
                System.out.print("Enter the element on " + i + " " + j + ": ");
                arrr[i][j] = sc.nextInt();
            }
        }


        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < arrr[0].length ; j++)
            {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
