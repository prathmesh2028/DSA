package loops.Forloop;

public class OddNumbersDivisibleBy31To100 {
    public static void main(String[] args) {
        System.out.println("Printing odd numbers divisible by 3 till 100");

        for(int i = 1 ; i <= 100 ; i++)
        {
            if((i % 2 != 0) && (i % 3 == 0))
            {
                System.out.print(i + " ");
            }
        }
    }
}
