package Methods;

public class Arguement {
    public static int sum(int a , int b , int c){ // a & b parameters
        if( a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;

    }
    public static void main(String[] args) {
        System.out.println(sum(24,25262,25)); // these are the arguement's
    }
}
