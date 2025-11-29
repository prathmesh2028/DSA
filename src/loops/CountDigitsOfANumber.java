package loops;
import java.util.Scanner;
public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        int numberOfDigits = 0;
        while(n != 0){
            n = n / 10;
            numberOfDigits ++;
        }
        System.out.println(numberOfDigits);
    }
}
