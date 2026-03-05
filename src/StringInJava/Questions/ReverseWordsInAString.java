package StringInJava.Questions;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "hello workd";
        s = s.trim();
        String[] str = s.split(" ");
        String ans = "";
        for (int f = str.length - 1; f >= 0; f--) {
            ans += str[f];
            if ((f != 0) && (!str[f].equals(""))) ans += " ";
        }
        System.out.println(ans);
    }
}
