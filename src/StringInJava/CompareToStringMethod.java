package StringInJava;

public class CompareToStringMethod {
    public static void main(String[] args) {
        String a = "Prathmesh";
        String b = "Qadhe";
        System.out.println(a.compareTo(b));
        System.out.println(compareTo(a,b));
    }
    public static int compareTo(String a , String b){
        if(a.equals(b)) return 0;
        if(a != b) return (a.length() - b.length());
        return -1;
    }
}
