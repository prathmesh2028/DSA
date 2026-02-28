package StringInJava.Questions;

import java.util.Scanner;

public class VowelsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int count = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
