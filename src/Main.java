import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int [] arr = {1,0,-2,3,0,4,8,0,10,12};
        //applying the selection sort here

        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex= j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for(int e:arr) System.out.print(e + " ");

     }
}