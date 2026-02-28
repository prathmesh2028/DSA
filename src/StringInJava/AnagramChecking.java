package StringInJava;
import java.util.*;
public class AnagramChecking {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "EllOh";
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
        Arrays.sort(s1c);
        Arrays.sort(s2c);
        String s11 = s1c.toString();
        String s22 = s2c.toString();
        if(s11.equalsIgnoreCase(s22)) System.out.println("Yes");
        else System.out.println("Nope");

    }
}
