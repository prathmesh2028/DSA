package Methods;

public class Syntax {
    public static void prathmesh(){
        System.out.println("Ashirwadd....!");
        shravan();
    }
    public static void shravan(){
        System.out.println("hello world");
        ajay();
    }
    public static void ajay(){
        System.out.println("shravan");
        prathmesh();
    }
    public static void main(String[] args) {
        prathmesh();
    }
}
