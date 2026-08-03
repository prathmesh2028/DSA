package Arrayss.Array_Revised.Questions;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {14,3,1,6,5,4,9,8};
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i%2 == 0) arr[i] += 10;
            else arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
