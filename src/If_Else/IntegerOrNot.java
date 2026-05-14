package If_Else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        double num = sc.nextDouble();
        int n = (int)num;
        if((num - n) == 0) System.out.println("Integer it is ");
        else System.out.println("Not a integer");

    }
}
