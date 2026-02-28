package StringInJava;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Prathmesh Badhe";
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.lastIndexOf('a'));
//        System.out.println(s.lastIndexOf('q'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("Prathm"));
        System.out.println(s.contains("adhe"));
        String str = "12345678";
        int n = Integer.parseInt(str);
        System.out.println(n + 1);
    }
}
