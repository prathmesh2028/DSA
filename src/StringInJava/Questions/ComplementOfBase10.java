package StringInJava.Questions;

public class ComplementOfBase10 {
    public static void main(String[] args) {
        decitobi(5);
    }
    public static void decitobi(int n){
        StringBuilder ans = new StringBuilder();
        while(n > 0){
            int digit = n % 2;
            ans.append(digit);
            n /= 2;
        }
        ans.reverse();
        System.out.println(ans);
        for(int i = 0 ; i < ans.length() ; i++){
            if(ans.charAt(i) == '1'){
                ans.setCharAt(i , '0');
            }
            else{
                ans.setCharAt(i , '1');
            }
        }
        System.out.println(ans);

        int binary = Integer.parseInt(ans.toString());
        System.out.println(binary);

        int finalans = 0;
        int pow = 1;
        while(binary > 0){
            int digit = binary % 10;
            finalans += digit * pow;
            pow *= 2;
            binary /= 10;
        }
        System.out.println(finalans);

    }
}
