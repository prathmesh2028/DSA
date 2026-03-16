package Recurrsion;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        print(10);
    }public static void print(int n){
        if ( n == 0 ) return;
        print(n - 1);
        System.out.println(n);
    }
}
