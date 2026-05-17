package Sample_practise;

import java.util.*;
class Sample{
    public static void main(String[] args) {
       // bridge pattern here :)
        int n = 5;
        int a = 1;
        for(int i = 1 ; i <= (2*n-1) ; i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(int i = 1 ; i <= (n-1) ; i++)
        {
            for(int j = 1 ; j <= (n-i) ; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1 ; j <= a ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= (n-i) ; j++)
            {
                System.out.print("* ");
            }
            a += 2;
            System.out.println();
        }
    }






}