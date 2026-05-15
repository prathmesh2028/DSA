package loops.Questions;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        int revNum = 0;
        while( n != 0)
        {
            int digit = n % 10;
            revNum *= 10;
            revNum += digit;
            n /= 10;
        }
        System.out.println(revNum);
    }

}
