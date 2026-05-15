package loops.Forloop;

public class AllEvenNumbers1To100 {
    public static void main(String[] args) {

        for(int i = 1 ; i <= 100 ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }


        // optimized way to do the same
        for(int i = 2 ; i <= 100 ; i += 2)
        {
            System.out.println(i);
        }

        // TABLE of 17
        for(int i = 17 ; i <= 170 ; i += 17)
        {
            System.out.print(i + " ");
        }
    }
}
