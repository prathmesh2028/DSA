package loops.Questions;

import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The number is " + num);

        // reversing the input number
        int revNum = 0;
        while(num != 0)
        {
            revNum *= 10;
            revNum += (num % 10);
            num /= 10;
        }
        System.out.println("The reversed number is : " + revNum);
        // adding the digits of the reversed number
        int sum = 0;
        while( revNum != 0)
        {
            sum += (revNum % 10);
            revNum /= 10;
        }



        System.out.println("Sum of reversed number is : " + sum);
    }
}
