package If_Else;

import java.util.Scanner;

public class TernaryForGreatestOfThreeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers\n");
        System.out.print("Enter first number n1 :");
        int n1 = sc.nextInt();
        System.out.print("Enter second number n2 :");
        int n2 = sc.nextInt();
        System.out.print("Enter third number n3 :");
        int n3 = sc.nextInt();

        System.out.println(n1 + " " + n2 + " " + n3);

        int result;
        result = (n1 > n2)
                ? ((n1 > n3) ? n1 : n3)
                : ((n2 > n3) ? n2 : n3);
        System.out.println(result);
    }
}
