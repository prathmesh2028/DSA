package OOPs;
class Cricketer{

    static String country = "INDIA";

    int runs;
    String name;
    double avg;
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
//        c1.country = "England"; cannot assign value to final variable
        System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
//        c1.country = "NZ";
        System.out.println(c2.country);
    }
}
