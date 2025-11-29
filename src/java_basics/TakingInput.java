package java_basics;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // taking input from the user
        System.out.print("Enter the number to get its square :");
        int n;
        n = sc.nextInt();
        System.out.println("The square of the number " + n + " is " + (n*n));
    }
}
