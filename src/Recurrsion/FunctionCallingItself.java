package Recurrsion;

public class FunctionCallingItself {
    public static void main(String[] args) {
//        ajay(1);
//        print(1000);
//        printnto1(50);
        oneton(1,50);
    }
    public static void ajay(int n){
        if(n == 5) return;
        System.out.println("priya");
        ajay(n+1);
    }
    public static void print(int n){
        if(n == 100) return;
        System.out.println(n);
        print(n-1);
    }
    public static void printnto1(int n){
        if(n==0) return;
        System.out.println(n);
        printnto1(n-1);
    }
    public static void oneton(int x , int n){
        if(x > n) return;
        System.out.println(x);
        oneton(x+1,n);
    }
}
