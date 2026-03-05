package StringInJava.Questions;

public class ReverseEachWordInAGivenString {
    public static void main(String[] args) {
        String s = "I like this program very much";
        StringBuilder ans = new StringBuilder();

        String[] str = s.split(" ");
        for(int i = 0 ; i < str.length ; i++){
            StringBuilder sb = new StringBuilder(str[i]);
            sb.reverse();
            ans.append(sb);

        }
        System.out.println(ans);
    }
}
