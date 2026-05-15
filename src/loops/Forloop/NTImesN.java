package loops.Forloop;

import java.util.Scanner;

public class NTImesN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String you want to print :");
        String str = sc.nextLine();
        System.out.print("Enter the number how much times you want to print it :");
        int times = sc.nextInt();

        for(int i = 0 ; i < times ; i++)
        {
            System.out.println(str + i);
        }
    }
}
