package loops.Forloop.Questions;

//import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // to print the following sequence :)
        /*
        1
        n
        2
        n-1
        3
        n-2
        .
        .
        .
        .
         */

        int n = 5;
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.println(i);
            System.out.println(n-i+1);
        }
    }
}
