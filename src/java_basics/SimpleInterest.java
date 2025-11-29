package java_basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();
        double r = sc.nextInt();
        double t = sc.nextInt();

        double s1 = (p * r * t)/100;
        System.out.println(s1);
        System.out.println(p*r*t);

    }
}
