package loops.Questions;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        int sum = 0;
        while(n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        System.out.println((sum >= 0) ? sum : -(sum));




    }
}
