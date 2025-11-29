package Pattern_Printing.Homework;

public class DiamondOfNumbersPattern {
    public static void main(String[] args) {
        int n = 5;
        int nspa = n - 1 , nsta = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= nspa ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= nsta ; k++){
                System.out.print(k);
            }
            nsta += 2;
            nspa --;
            System.out.println();
        }


        nspa = 1 ;
        nsta = 2*n - 3;
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j <= nspa ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= nsta ; k++){
                System.out.print(k);
            }
            nsta -= 2;
            nspa ++;
            System.out.println();
        }
    }
}
