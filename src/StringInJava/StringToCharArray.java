package StringInJava;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "PRATHMESH HANUMANT BADHE";
        char[] c = s.toCharArray();
        System.out.println(c);
        // or
        for(char chr : c){
            System.out.println(chr + " ");
        }
    }
}
