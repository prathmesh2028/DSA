package java_basics;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Enter the number to check whether it is integer or not :");
        n = sc.nextDouble();
        int x = (int)n;
        if( n == x ) System.out.println("It is an integer");
        else System.out.println("It is not an integer");

    }
}
