package If_Else;

import java.util.Scanner;

public class DivisibleBy5And3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if((num % 5 == 0) && (num % 3 == 0))
        {
            System.out.print("Divisible 5 and 3");
        }
        else if(num % 5 == 0) System.out.println("Divisible by 5");
        else if(num % 3 == 0) System.out.println("Divisible by 3");
        else System.out.println("Not divsible by ny of the number");


        if((num % 5 == 0))
        {
            if((num % 3 == 0))
            {
                System.out.println("Divisible by 5 and 3");
            }
            else System.out.println("Divisible by 5");
        }
        else if (num % 3 == 0) System.out.print("Divisible by only 3");
        else System.out.println("Not divisible by any of the number :)");
    }
}
