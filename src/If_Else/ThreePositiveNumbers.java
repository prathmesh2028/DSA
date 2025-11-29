package If_Else;

import java.util.Scanner;

public class ThreePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x , y , z;
//        System.out.print("Enter the value of x");
//        x = sc.nextInt();
//        System.out.print("Enter the value of y");
//        y = sc.nextInt();
//        System.out.print("Enter the value of z");
//        z = sc.nextInt();
//        if(x > 0 && y > 0 && z > 0){
//            if(x > y && x > z){
//                System.out.println(x + " is the greatest");
//            }
//            else if(y > x && y > z){
//                System.out.println(y + " is the greatest");
//            }
//            else if(z > x && z > y){
//                System.out.println(z + " is the greatest");
//            }
//        }
//        else{
//            System.out.println("PLease enter the positive integers only");
//        }

        int x , y , z;
        System.out.print("Enter the value of x");
        x = sc.nextInt();
        System.out.print("Enter the value of y");
        y = sc.nextInt();
        System.out.print("Enter the value of z");
        z = sc.nextInt();
        if(x > 0 && y > 0 && z > 0){
            if(x < y && x < z){
                System.out.println(x + " is the smallest");
            }
            else if(y < x && y < z){
                System.out.println(y + " is the smallest");
            }
            else if(z < x && z < y){
                System.out.println(z + " is the smallest");
            }
        }
        else{
            System.out.println("PLease enter the positive integers only");
        }
    }
}
