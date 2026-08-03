package Arrayss.Array_Revised;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr = {-6,8,14,-2,24,4,3,10};

        // method 1
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);

        // method 2
        int max1 = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max1);
    }
}
