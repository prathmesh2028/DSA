package Arrays.Basic;

import java.util.Scanner;

public class ArrayIO {
    static public void main(String[] args) {
        int[] arr = new int[9];
        System.out.println(arr.length);

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter the value in array " + i + " : ");
            arr[i] = sc.nextInt();
        }



        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
