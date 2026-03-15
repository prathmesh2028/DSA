package StringInJava.Questions;

public class RemoveVowelsFromAString {
    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i < sb.length() ; i++){
            char ch = sb.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
}
