package Pattern_Printing.Homework;

public class NumberSquare_2 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1; j <= n ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
