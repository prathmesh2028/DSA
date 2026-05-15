package loops.Forloop;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.print(num * i + " ");
        }

        System.out.println();

        // more optimized
        for(int i = num ; i <= (num * 10) ; i += num )
        {
            System.out.print(i + " ");
        }
    }
}
