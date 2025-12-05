package OOPs;
class Cricketer{

    final String country = "INDIA";

    int runs;
    String name;
    double avg;
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
//        c1.country = "England"; cannot assign value to final variable
        System.out.println(c1.country);
    }
}
