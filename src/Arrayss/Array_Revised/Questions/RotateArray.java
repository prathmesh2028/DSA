package Arrayss.Array_Revised.Questions;

import Arrayss.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args)
    {
        // code here to rotate an array
        int[] arr = {6 , 8 , 1 , 2 , 4 , 9 , 0};
        int n = arr.length;
        int d = 3;
        System.out.println(Arrays.toString(arr));
        revarr(arr , 0 , d-1);
        revarr(arr,d,n-1);
        revarr(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void revarr(int[] arr , int i , int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
