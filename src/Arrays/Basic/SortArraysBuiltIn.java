package Arrays.Basic;

import java.util.Arrays;

public class SortArraysBuiltIn {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,2};
        for(int i:arr) System.out.print(i + " ");
        Arrays.sort(arr);
        System.out.println();
        for(int i:arr) System.out.print(i + " ");

    }
}
