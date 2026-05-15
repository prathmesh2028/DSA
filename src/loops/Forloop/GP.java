package loops.Forloop;

public class GP {
    public static void main(String[] args) {
        // diplay the GP
        // 1,2 4,8
        // a = 1;
        // r = 2;
        int n = 100;
        int a = 1;
        int r = 2;

        // printing all terms till 100
        for(int i = 1 ; i <= 100 ; i *= 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();


        // printing all 100 terms
        for(int i = 1 ; i <= 100 ; i++)
        {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
