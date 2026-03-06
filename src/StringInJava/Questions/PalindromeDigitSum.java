package StringInJava.Questions;

public class PalindromeDigitSum {
    public static void main(String[] args) {
        int n = 56;
        int sum = 0;
        int num = n;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
//        System.out.println(sum);
        String str = Integer.toString(sum);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
