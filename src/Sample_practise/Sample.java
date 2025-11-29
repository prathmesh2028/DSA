package Sample_practise;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        // BRIDGE PATTERN
        int a = 4;
        int b = 2;
        int ans = 1;
        for(int i = 1 ; i <= b ; i++){
            ans *= a;
        }
        System.out.println(ans);


    }
}
