package StringInJava.Questions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s = sc.next();
        int i = 0;
        int j = s.length()-1;
        Boolean ispalindrome = true;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                ispalindrome = false;
                break;
            }
        }
        if(ispalindrome) System.out.println("String is palindrome");
        else System.out.println("String is not a palindrome");

        // leetcode approach
//        public boolean isPalindrome(String s) {
//            // String str = s;
//            String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//            result = result.toLowerCase();
//            int i = 0, j = result.length()-1;
//            while(i <= j){
//                if(result.charAt(i) != result.charAt(j)) return false;
//                i++;
//                j--;
//            }
//            return true;
    }
}
