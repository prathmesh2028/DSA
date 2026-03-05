package StringInJava.Questions;

public class EasyString_StringCompression {
    public static void main(String[] args) {
        String s = "aaABBb";
        s = s.toLowerCase();
        StringBuilder ans = new StringBuilder();
        int i = 0 , j = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            else{
                ans.append((j-i));
                ans.append(s.charAt(i));
                i = j;
            }
        }
        ans.append(j-i);
        ans.append(s.charAt(i));
        System.out.println(ans);
    }
}
