package Methods;

public class PermutationAndCombination {
    public static void nCr(int n , int r){
        int nFactorial = 1;
        int rFactorial = 1;
        for(int i = 1 ; i <= n ; i++){
            nFactorial *= i;
        }
        for(int i = 1 ; i <= r ; i++){
            rFactorial *= i;
        }
        int ans = (nFactorial) / (rFactorial * (nFactorial - rFactorial));
        System.out.println(ans);
    }
    public static void main(String[] args) {
        nCr(4,3);
    }
}
