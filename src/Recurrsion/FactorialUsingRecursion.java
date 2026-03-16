package Recurrsion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }
    public static int facto(int n ){
        if( n == 0 || n == 1) return 1;
        int fact = n * facto(n-1);
        return fact;
    }
}
