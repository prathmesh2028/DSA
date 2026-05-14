package If_Else;

import java.util.Scanner;

public class DivisibleBy5OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if(num > 0 && (num % 5 == 0)) System.out.println("Divisible by 5");
        else System.out.println("Not divisible");
    }
}
