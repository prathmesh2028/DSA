package If_Else;

import java.util.Scanner;

public class QuadrantSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the x ordinate :");
        x = sc.nextInt();
        int y;
        System.out.print("Enter the y ordinate :");
        y = sc.nextInt();
        if(x == 0 && y == 0) System.out.println("ORIGIN");
        else if(x > 0 && y > 0) System.out.println("I quadrant");
        else if(x < 0 && y < 0) System.out.println("III quadrant");
        else if(x < 0 && y > 0) System.out.println("II quadrant");
        else if(x > 0 && y < 0) System.out.println("IV quadrant");
        else if(x == 0 && (y > 0 || y < 0)) System.out.println("y axis");
        else if(y == 0 && (x > 0 || x < 0)) System.out.println("x axis");
        else System.out.println("Kindly enter valid ordinates....");
    }
}
