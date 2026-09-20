package Sorting.Sorting_Revised;

import java.util.Arrays;

public class BubbleSort_Better {
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};
        boolean isSorted = true;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int k = 0 ; k < arr.length-1 ; k++)
            {
                if(arr[k] > arr[k+1])
                {
                    isSorted = false;
                    break;
                }
            }

            if(isSorted) break;

            for(int j = 0 ; j < arr.length - i -1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



        // another approach

        for(int i = 0 ; i < arr.length ; i++)
        {
            int swaps = 0;
            for(int j = 0 ; j < arr.length - i -1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                swaps++;
            }
            if(swaps==0) break;
        }
    }
}
