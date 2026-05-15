package loops.Forloop;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number how much you want the Ap terms :");
        int terms = sc.nextInt();
        int n = terms;
        int d = 3;
        int a = 2;

        for(int i = 1 ; i <= n ; i++)
        {
            int nthTerm = a + (i-1) * d;
            System.out.print(nthTerm + " ");
        }

        System.out.println();
        // very optimized approach
        for(int i = 2 ; i <= (3*n - 1) ; i += 3)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        // another approach
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(a + " ");
            a += d;
        }
    }
}
