package If_Else;
import java.util.Scanner;
public class MagnitudeSmallerThan69OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number to check :");
        n = sc.nextInt();
        if(n < 0) n = -n;
        if(n < 69) System.out.println("Magnitude is smaller");
        else System.out.println("Magnitude is larger than 69");
    }
}
