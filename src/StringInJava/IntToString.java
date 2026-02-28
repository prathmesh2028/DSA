package StringInJava;

import java.util.Scanner;

public class IntToString  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s);

        // built in method
//        String s = Integer.toString(n);
    }
}
