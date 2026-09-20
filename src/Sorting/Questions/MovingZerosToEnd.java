package Sorting.Questions;

import java.util.Arrays;

public class MovingZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,-2,3,0,4,8,0,10,12};
        System.out.println(Arrays.toString(arr));
        System.out.println();


        int i=0,j = 0;
        while(i < arr.length && j < arr.length)
        {
            if(arr[i] == 0) i++;
            else if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
