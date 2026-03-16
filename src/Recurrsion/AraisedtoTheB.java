package Recurrsion;

public class AraisedtoTheB {
    public static void main(String[] args) {
//        power(2,5);
        System.out.println(pow(2,5));
    }
    public static void power(int a , int b){
        int ans = 1;
        for(int i = 0 ; i < b ; i++){
            ans *= a;
        }
        System.out.println(ans);
    }
    public static int pow (int a , int b){
        if ( b == 0) return 1;
        return a * pow(a,b-1);
    }
}
