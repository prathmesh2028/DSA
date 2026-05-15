package loops.Forloop.Questions;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        for(int i = 1 ; i <= Math.sqrt(num) ; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
                System.out.print(num/i);
                System.out.println();
            }
        }
    }
}
