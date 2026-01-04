package Pattern_Printing;

public class NumberSpiral {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1 ; i <= (2*n -1 ) ; i++){
            for(int j = 1 ; j <= (2*n - 1) ; j++){
                int a = i , b = j;
                if(i > n) a = 2*n - i;
                if(j > n) b = 2*n - j;

                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();
        }


        // or
//        int n = 4;
//        for(int i = 1 ; i <= n ; i++){
//            for(int j = 1 ; j <= n ; j++){
//                System.out.print(Math.min(i,j) + " ");
//            }
//            for(int j = (n-1) ; j > 0 ; j--){
//                System.out.print(Math.min(i,j) + " ");
//            }
//            System.out.println();
//        }
//        for(int i = (n-1) ; i > 0 ; i--){
//            for(int j = 1 ; j <= n ; j++){
//                System.out.print(Math.min(i,j) + " ");
//            }
//            for(int j = (n-1) ; j > 0 ; j--){
//                System.out.print(Math.min(i,j) + " ");
//            }
//            System.out.println();
//        }
    }
}
