package Pattern_Printing.Homework;

public class InvertedTriangleOfNumbers {
    public static void main(String[] args) {
        int n = 4;
//        for(int i = 1 ; i <= n ; i++){
//            for(int j = 1 ; j <= (n - i + 1) ; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


        //similarly for characters it will be

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= (n - i + 1) ; j++){
                System.out.print((char)(j + 96));
            }
            System.out.println();
        }
    }
}
