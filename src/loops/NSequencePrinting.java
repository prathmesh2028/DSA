package loops;
import java.util.Scanner;
public class NSequencePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        for(int i = 1 , j = n; i <= n ; i++ , j--){
            System.out.println(i);
            System.out.println(j);
        }

    }
}
