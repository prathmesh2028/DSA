package Arrayss.Array_Revised.Two_D_Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateBy90 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4} , {7,2,1,6} , {5,5,4,1} , {3,1,8,2}};

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            int j = 0 , k = arr[0].length-1;
            while(j < k)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
