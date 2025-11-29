package loops;

public class ReverseAndSum {
    public static void main(String[] args) {
        int n = 1286;
        int x = n;
        int reverse = 0;
        while( x > 0){
            int digit = x% 10;
            reverse *= 10;
            reverse += digit;
            x /= 10;
        }
        System.out.println("The reverse number is :" + reverse);

        int number = n + reverse;
        System.out.println(number);
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of it's reverse is " + sum);
    }
}
