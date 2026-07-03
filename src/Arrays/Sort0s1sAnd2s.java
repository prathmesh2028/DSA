package Arrays;
import java.util.*;
public class Sort0s1sAnd2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0, 0, 0, 1};

        // merge sort brute force
//        Arrays.sort(arr);
        for(int i:arr) System.out.print(i + " ");

        int n0 = 0 , n1 = 0 , n2= 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0) n0++;
            if(arr[i] == 1) n1++;
            if(arr[i] == 2) n2++;
        }

        for(int i = 0 ; i < n0 ; i++)
        {
            arr[i] = 0;
        }
        for(int i = n0 ; i < n0+n1 ; i++) arr[i] = 1;
        for(int i = n0+n1 ; i < arr.length ; i++) arr[i] = 2;
        System.out.println();
        for(int i:arr) System.out.print(i + " ");

    }
}
