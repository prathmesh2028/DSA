package java_basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third number :");
        int num3 = sc.nextInt();
        int sum = (num1 + num2 + num3);
        System.out.println("sum is " + sum);
    }
}
