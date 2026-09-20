package Sorting.Sorting_Revised;

import java.util.Arrays;

public class BubbleSort_Reversed {
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};

        for(int i = arr.length-1 ; i >= 0 ; i--)
        {
            int swaps = 0;
            for(int j = arr.length-1 ; j >=1 ; j--)
            {
                if(arr[j] > arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                swaps++;
            }
            if(swaps==0) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
