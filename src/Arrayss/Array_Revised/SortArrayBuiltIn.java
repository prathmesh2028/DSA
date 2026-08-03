package Arrayss.Array_Revised;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // soer ascending order
        int[] arr = {4,1,7,5,-3,10,2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
