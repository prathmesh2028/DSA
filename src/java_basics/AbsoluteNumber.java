package java_basics;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get it's absolute value :");
        int n;
        n = sc.nextInt();
        if(n < 0) n = -n;
        System.out.println(n);
    }
}
