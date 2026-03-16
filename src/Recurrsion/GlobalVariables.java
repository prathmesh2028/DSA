package Recurrsion;

public class GlobalVariables {
    static int x = 10; // this is an global variable
    public static void main(String[] args) {
//        fun();
        x = 9; // change
        System.out.println(x);
        int x = 4;
        System.out.println(x);
        x = 6;
        System.out.println(x);
    }
    public static void fun(){
        x = 20;
    }
}
