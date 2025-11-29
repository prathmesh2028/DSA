package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
//    public static void nCr(int n , int r){
//        int nFactorial = 1;
//        int rFactorial = 1;
//        for(int i = 1 ; i <= n ; i++){
//            nFactorial *= i;
//        }
//        for(int i = 1 ; i <= r ; i++){
//            rFactorial *= i;
//        }
//        int ans = (nFactorial) / (rFactorial * (nFactorial - rFactorial));
//        System.out.println(ans);
//    }
//    public static void main(String[] args) {
//        nCr(4,3);
//    }


    // METHOD 2
    public static int fact(int a){
        int fact = 1;
        if(a == 1 || a == 0) return fact;
        else{
            for(int i = 1 ; i <= a ; i++){
                fact *= i;
            }
            return fact;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.print("Enter the value of n :");
        n = sc.nextInt();
        int r = 1;
        System.out.print("Enter the value of r :");
        r = sc.nextInt();

        int c = fact(n) / (fact(r) * (fact(n-r)));
        int p = fact(n) / (fact(n-r));
        System.out.println("nCr is : " + c);
        System.out.println("nPr is : " + p);
        System.out.println("End of the code :)");
    }
}
