package loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        int reverseNum = 0;
        while(n > 0){
            int digit = n % 10;
            reverseNum *= 10;
            reverseNum += digit;
            n /= 10;
        }
        System.out.println(reverseNum);
    }

}
