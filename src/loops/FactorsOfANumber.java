package loops;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("ENter a number :");
        n = sc.nextInt();
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                if(i == (n/i)){
                    System.out.println(i + " ");
                }
                else{
                    System.out.print(n/i + " " + i + " ");
                }
            }
        }
    }
}
