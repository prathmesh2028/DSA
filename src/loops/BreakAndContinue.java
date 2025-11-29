package loops;
import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        boolean flag = false;
        if(n == 1 || n == 0){
            System.out.println(n + " is neither prime nor composite");
        }
        else if(n < 0) System.out.println("Please enter +ve number");
        else{
            for(int i = 2 ; i < n ; i ++){
                if(n % i == 0){
                    flag = true;
                    break;
                }
            }
        }
        if(flag) System.out.println("Number is composite");
        else System.out.println("Number is prime");
    }
}
