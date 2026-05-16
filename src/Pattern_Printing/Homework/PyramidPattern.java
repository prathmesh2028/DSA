package Pattern_Printing.Homework;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 4;


        /*

            *
           ***
          *****
         *******
        *********

         */

        int nsp = n-1 , nst = 1;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= nsp ; j++)
            {
                System.out.print("  ");

            }
            nsp--;
            for(int j = 1 ; j <= nst ; j++)
            {
                System.out.print("* ");

            }
            nst += 2;
            System.out.println();
        }
//        for(int i = 1 ; i <= n ; i++){
//            for(int j = 1 ; j <= (n - i) ; j++){
//                System.out.print("  ");
//            }
//            for(int k = 1 ; k <= (2*i - 1) ; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        // method 2;
//        int nspa = n - 1 , nsta = 1;
//        for(int i = 1 ; i <= n ; i++){
//            for(int j = 1 ; j <= nspa ; j++){
//                System.out.print("  ");
//            }
//            for(int k = 1 ; k <= nsta ; k++){
//                System.out.print("* ");
//            }
//            nsta += 2;
//            nspa--;
//            System.out.println();
//        }



    }
}
