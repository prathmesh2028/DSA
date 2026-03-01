package StringInJava;

public class Equals {
    public static void main(String[] args) {
        String s1 = new String("prathmesh");
        String s2 = new String("prathmesh");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        String s3 = "prathmesh";
        String s4 = "prathmesh";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
