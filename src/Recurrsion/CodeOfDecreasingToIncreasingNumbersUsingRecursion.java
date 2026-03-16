package Recurrsion;

public class CodeOfDecreasingToIncreasingNumbersUsingRecursion {
    public static void main(String[] args) {
        dectoinc(10);
    }
    public static void dectoinc(int n){
        if(n == 0) return;
        System.out.println(n);
        dectoinc(n-1);
        if(n != 1) System.out.println(n);
    }
}
