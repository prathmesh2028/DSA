package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number :");
        n = sc.nextInt();
//        for(int i = 1 ; i <= n ; i++){
//            System.out.println("PRATHMESH");
//        }
//        for(int i = 2 ; i <= 100 ; i+=2){
//            System.out.println(i);
//        }

        //table of 17
//        int n = 17;
//        for(int i = 1 ; i <= 10 ; i++){
//            System.out.print(n * i + " ");
//        }

//        for(int i = 17 ; i <= 170 ; i+=17){
//            System.out.print(i + " ");
//        }

//        for(int i = 1 ; i <= 100 ; i += 2){
//            if(i % 3 == 0){
//                System.out.println(i);
//            }
//        }


        //Decreasing loop hi ye
//        for(int i = n ; i >= 0 ; i--){
//            System.out.println(i);
//        }

        // AP 2 , 5 , 8 , 11 ..... upto n
        for(int i = 2; i <= 3*n - 1 ; i += 3){
            System.out.println(i);
        }
    }
}
