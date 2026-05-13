package Basics;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[])
    {
        // area = pi * r * r;
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.printf("%.4f" , area);
    }
}
