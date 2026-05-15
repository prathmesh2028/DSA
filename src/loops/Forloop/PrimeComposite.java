package loops.Forloop;

import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        boolean isPrime = true;

        // more optimized code
        for(int i = 2 ; i < Math.sqrt(num) ; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }

        }
        if(num == 1 || num == 0) System.out.println("Neither prime nor composite");
        else if(isPrime) System.out.println("Number is a prime");
        else System.out.println("Not a prime number it is composite");
    }
}
