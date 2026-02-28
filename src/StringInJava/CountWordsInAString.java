package StringInJava;

import java.util.StringTokenizer;

public class CountWordsInAString {
    public static void main(String[] args) {
        String s = "Hello world";
        StringTokenizer st = new StringTokenizer(s);
        int count = 0;
        while(st.hasMoreTokens()){
            count++;
            st.nextToken();
        }
        System.out.println(count);

        // or also we can use the function of str.split
        String [] a = s.split(" ");
        count = 0;
        for(int i = 0 ; i < a.length ; i++){
            count++;
        }
        System.out.println(count);

    }
}
