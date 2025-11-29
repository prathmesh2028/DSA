package Methods;

import java.util.Scanner;

public class TwoNumbersSwapping {
    public static void main(String[] args) {

        //USING THE THRID VARIABLE
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Values before swaping is :" + a + " " + b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("Values after swaping is :" + a + " " + b);



        // without using third variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("Values after swaping is :" + a + " " + b);



        // using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values after swaping is :" + a + " " + b);

    }
}
