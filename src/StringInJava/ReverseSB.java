package StringInJava;

public class ReverseSB {
    public static void main(String[] args) {
        String s = "Devesh";
        StringBuilder sb  = new StringBuilder(s);
        // sb.reverse();
//        sb.delete(0 , sb.length());
        sb.deleteCharAt(2);
        sb.insert(2 , 'v');
        System.out.println(sb);

    }
}
