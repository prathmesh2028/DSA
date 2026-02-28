package StringInJava;

public class PassingStringtoMetnod {
    public static void change(String x){
        x = "Utkarsh";
    }
    public static void main(String[] args) {
        String x = "Prathmesh";
        change(x);
        System.out.println(x);
    }
}
