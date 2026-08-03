package Arrayss.Array_Revised.Questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9,100};
        int i = 0;
        int j = arr.length-1;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void revArr(int[] arr , int i , int j)
    {
        while(i < j)
        {
            int temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
