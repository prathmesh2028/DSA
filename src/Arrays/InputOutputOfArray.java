package Arrays;

import java.util.Scanner;

public class InputOutputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr  = {11,33,-76,34,21,52,12};
//
//        int n = arr.length;
//        for(int i = 1 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }
        int[] array = new int[7];

        //default values i.e 0
//        for(int i = 0 ; i < 7 ; i++){
//            System.out.print(array[i] + " ");
//        }

        // input
        for(int i = 0 ; i < 7 ; i++){
            array[i] = sc.nextInt();
        }

        //print
        for(int i = 0 ; i < 7 ; i++){
            System.out.print(2*array[i] + " ");
        }


    }
}
