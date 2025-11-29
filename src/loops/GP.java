package loops;

public class GP {
    public static void main(String[] args) {
        int a = 1 , r = 2;
        int n =10 ;
        for(int i = 1 ; i <= n ; i++){
            System.out.println(a);
            a *= r;
        }
    }
}
