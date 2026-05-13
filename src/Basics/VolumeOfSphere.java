package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of sphere to calculate its volume :");
        double r = sc.nextDouble();

        double volume = (4/3) * Math.PI * r * r * r;
        System.out.println(volume);
        System.out.printf("%.2f" , volume);
    }
}
