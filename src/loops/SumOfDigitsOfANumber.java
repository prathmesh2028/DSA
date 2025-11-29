package loops;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int n = 1234567890;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println((sum >= 0) ? sum : -sum);
    }
}
