package StringInJava.Questions;

public class GoodStringOrNot {
    public static void main(String[] args) {
        String s = "abacbc";
        int n = s.length();
        int[] freq = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
        }
        int frequency = freq[s.charAt(0) - 97];
        System.out.println(frequency);
        for(int i = 0 ; i < n ; i++){
            if(freq[s.charAt(i) - 97] != frequency){
                System.out.println("false");
                break;
            }
        }
    }
}
