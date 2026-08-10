package Arrayss.Array_Revised.Questions;

import java.util.Arrays;

public class AddOneArray {
    public static void main(String[] args) {
        int[] arr = {9,9,8,7,2,1,9,9,9};
        System.out.println(Arrays.toString(addOneInArray(arr)));
    }
    public static int[] addOneInArray(int[] arr)
    {
        int n = arr.length;
        for(int i = n-1 ; i >= 0 ; i--)
        {
            if(arr[i] < 9)
            {
                arr[i]++;
                return arr;
            }
           arr[i] = 0;
        }
        int[] ansarr = new int[n+1];
        ansarr[0] = 1;
        return ansarr;
    }
}
