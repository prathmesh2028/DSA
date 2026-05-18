package Basics.Methods;

public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));
        double a = Math.sin(30 *(Math.PI/180));
        System.out.println(a);
        System.out.println(Math.cbrt(27));
        System.out.println(Math.abs(-50));
        System.out.println(Math.floor(-7.8));
        System.out.println(Math.ceil(-7.8));
        System.out.println(Math.min(3,4));
        System.out.println(Math.max(4,5));
        System.out.println(Math.pow(Math.PI , 44));


        // max of 3 nums
        int i = 1 , j = 2 , k = 3;
        System.out.println(Math.max(k , Math.max(i,j)));
    }
}
