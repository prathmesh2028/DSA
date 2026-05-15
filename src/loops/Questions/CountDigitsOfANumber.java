package loops.Questions;
import java.util.Scanner;
public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        if( n == 0) n = 1;
        int digits = 0;
        while( n != 0)
        {
            n = n / 10;
            digits++;
        }
        System.out.println(digits);
    }
}
