package StringInJava.Questions;
import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "prathamesh";
        System.out.println(getMaxOccuringChar(s));
        System.out.println(getMaxOccuringChar2(s));
        System.out.println(getMaxOccuringChar3(s));
    }
    // 1. BRUTE FORCE APPROACH
    public static char getMaxOccuringChar(String s) {
        // code here
        int n = s.length();
        char ans = s.charAt(0);
        int maxfreq = -1;
        for(int i = 0 ; i < n ; i++){
            int freq = 1;
            char ch = s.charAt(i);
            for(int j = i+1 ; j < n ; j++){
                if(ch == s.charAt(j)) freq++;
            }
            if(freq > maxfreq){
                maxfreq = freq;
                ans = ch;
            }
            else if(freq == maxfreq && ans > ch){
                ans = ch;
            }
        }
        return ans;
    }

    // 2 . Optimized approach by using the sliding window
    public static char getMaxOccuringChar2(String s){
        int n = s.length();
        int maxfreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int i = 0 , j = 0;
        while(j < n){
            if(arr[i] == arr[j]) j++;
            else{
                int freq = j-i;
                if(freq > maxfreq){
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > maxfreq){
            maxfreq = freq;
            ans = arr[i];
        }
        return ans;
    }

    // 3. Ultra Optimized approach by using frequency array
    public static char getMaxOccuringChar3(String s){
        int n = s.length();
        int[] freq = new int[26];
        char ans = s.charAt(0);
        int maxfreq = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] > maxfreq){
                maxfreq = freq[i];
                ans = (char)(i + 97);
            }
        }
        return ans;
    }


}
