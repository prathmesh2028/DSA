package Basics;

import java.util.Scanner;

public class TSAOfCuboid {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sides of a cuboid\n");
        System.out.print("Length :");
        double l = sc.nextDouble();
        System.out.print("Width :");
        double w = sc.nextDouble();
        System.out.print("Height :");
        double h = sc.nextDouble();

        double area = 2*(l*w + l*h + w*h);
        System.out.println(area);
        System.out.printf("%.2f" , area);
    }
}
