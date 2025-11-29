package If_Else;
import java.util.Scanner;
public class TernaryOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number to check odd or even :");
        n = sc.nextInt();
        String result = (n % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);
    }
}
