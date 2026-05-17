package Pattern_Printing.Homework;

public class DiamondPattern {
    public static void main(String[] args) {
        // diamond pattern here
        int n = 4;

        int nsp = (n-1) , nst = 1;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= nsp ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= nst ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
        nsp = 1;
        nst = n+1;
        for(int i = 2 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= nsp ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= nst ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }
}
