package If_Else;

import java.util.Scanner;

public class RecAreaGreaterThanPerimeterOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length , breadth;
        System.out.print("Enter the length of the rectangle :");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle :");
        breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2*(length + breadth);
        if(area > perimeter){
            System.out.println("The area of the rectangle is more than perimeter...");
        }
        else{
            System.out.println("The area of the rectangle is not at all more than perimeter...");
        }
    }
}
