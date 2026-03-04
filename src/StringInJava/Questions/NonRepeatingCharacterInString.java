package StringInJava.Questions;
import java.util.Arrays;

public class NonRepeatingCharacterInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        int[] freq = new int[26];
        char ans = s.charAt(0);
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 97]++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(freq[s.charAt(i) - 97] == 1){
                ans = s.charAt(i);
                break;
            }
        }
        System.out.println(ans);
    }
}
