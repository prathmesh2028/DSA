package Pattern_Printing.Homework;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        int n = 4;
//        for(int i = n ; i > 0 ; i--){
//            for(int j = i ; j > 0 ; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= (n + 1 -i) ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
