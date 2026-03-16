package Recurrsion;

import java.util.Scanner;

public class OneToN {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
//        print(1);
        OneToN(n);
    }
    public static void print(int x){
        if(x > n) return;
        System.out.println(x);
        print(x+1);
    }
    public static void OneToN(int n){
        if(n == 0) return;
        OneToN(n-1);
        System.out.println(n);
    }
}
