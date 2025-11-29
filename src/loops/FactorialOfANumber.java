package loops;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int n = 5;
        int facto = 1;
        for(int i = 1 ; i <= n ; i++){
            facto *= i;
        }
        System.out.println(facto);
    }
}
