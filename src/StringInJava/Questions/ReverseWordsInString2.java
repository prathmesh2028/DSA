package StringInJava.Questions;

public class ReverseWordsInString2 {
    public static void main(String[] args) {
        String s = "..geeks..for.geeks";
        String[] str = s.split("\\.");
//        for(int i = 0 ; i < str.length ; i++) System.out.println(str[i] + " " +i);
        StringBuilder ans = new StringBuilder();
        for(int i = str.length-1 ; i >= 0 ; i--){
            if(!str[i].equals("")) ans.append(str[i]);
            if(i != 0 && (!str[i].isEmpty())) {
                ans.append(".");
            }
        }
        if(ans.charAt(ans.length()-1) == '.'){
            ans.deleteCharAt(ans.length()-1);
        }
        System.out.println(ans);
    }
}
