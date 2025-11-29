package If_Else;

import java.util.Scanner;

public class FourDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number to check if it is four digit or not :");
        n = sc.nextInt();
        if(n > 0){
            if(n > 999 && n <= 9999){
                System.out.println("The entered number is a four digit number");
            }
            else{
                System.out.println("The entered number is not a four digit number");
            }
        }
        else{
            System.out.println("Please enter a positive number");
        }
    }
}
