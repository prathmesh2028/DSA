package If_Else;

import java.util.Scanner;

public class PositiveIntAndPrintNamesAccordingly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("ENter the number :");
        n = sc.nextInt();
        if(n > 0){
            if(n % 3 == 0 && n % 5 == 0) System.out.println("APURVA");
            else if(n % 5 == 0) System.out.println("RIYA");
            else if(n % 3 == 0) System.out.println("BANU");
            else if(n % 3 != 0 && n % 5 != 0) System.out.println("ISHA");
        }
        else{
            System.out.println("Enter positive number only please...!");
        }
    }
}
