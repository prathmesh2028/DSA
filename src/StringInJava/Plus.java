package StringInJava;

public class Plus {
    public static void main(String[] args) {
        String s = "bhakti";
        s = s + " hi shakti hai";
        System.out.println(s);
        s += 23456;
        System.out.println(s);
        s += '\n';
        s += 'n';
        System.out.println(s);
        System.out.println("prathmesh" + 10 + 20); // prathmesh1020
        System.out.println(10 + 20 + "prathmesh");
        System.out.println(10 + "prathmesh" + 20);
        s += 100.78;
        System.out.println(s);
    }
}
