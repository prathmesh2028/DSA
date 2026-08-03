package Arrayss.Array_Revised.Basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];

        // input
        for(int i = 0 ; i < x.length ; i++)
        {
            System.out.print("Enter value at " + i + " :");
            x[i] = sc.nextInt();
        }

        //print
        for(int i = 0 ; i < x.length ; i++)
        {
            System.out.print(x[i]*2 + " ");
        }
    }
}
