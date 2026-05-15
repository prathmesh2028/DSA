package loops.Forloop;

public class AP1 {
    public static void main(String[] args) {
        // to print this series
        // 99 , 95 , 91 , 87 upto all +ve terms

        // method 1
        for(int i = 99 ; i > 0 ; i -= 4)
        {
            System.out.print(i + " ");
        }


        System.out.println();


        //method 2
        int a = 99 , d = 4;
        for(; a > 0 ;)
        {
            System.out.print(a + " ");
            a -= d;
        }
    }
}
