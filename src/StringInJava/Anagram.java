package StringInJava;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks" , "kseeg"));
    }
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int a = s1.length();
        int b = s2.length();
        if(a != b) return false;

        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);
        for(int i = 0 ; i < x.length ; i++){
            if(x[i] != y[i]) return false;
        }
        return true;
    }
}
