package StringInJava.Questions;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String s1 = "prathmesh";
        String s2 = "badhe";
        StringBuilder ans = new StringBuilder();

        int n = s1.length() , m = s2.length();
        int i = 0 , j = 0;
        while(i < n && j < m){
            ans.append(s1.charAt(i));
            ans.append(s2.charAt(j));
            i++;
            j++;
        }
        while(i < n){
            ans.append(s1.charAt(i));
            i++;
        }
        while(j < m){
            ans.append(s2.charAt(j));
            j++;
        }
        System.out.println(ans);
    }
}
