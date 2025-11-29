package Pattern_Printing.Homework;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 10;
        int nsp = n - 1 , nst = 1;
        for(int i = 1 ; i <=  n ; i++){
            for(int j = 1 ; j <= nsp ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= nst ; k++){
                System.out.print("* ");
            }
            nsp --;
            nst += 2;
            System.out.println();
        }


        nsp = 1;
        nst = 2*n - 3;
        for(int i = 1 ; i <  n ; i++){
            for(int j = 1 ; j <= nsp ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= nst ; k++){
                System.out.print("* ");
            }
            nsp ++;
            nst -= 2;
            System.out.println();
        }
    }
}
