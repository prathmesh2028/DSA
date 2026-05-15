package loops.Questions;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int n = 5;
        long facto = 1;
        for(int i = 1 ; i <= n ; i++){
            facto *= i;
        }
        System.out.println(facto);



        // factorials of numbers from 1 to 10;
        System.out.println();

        facto = 1;
        for(int i = 1 ; i <= 100 ; i++)
        {
            facto *= i;
            System.out.println(facto);
        }


        BigInteger fact = BigInteger.ONE;
        for(int i = 1 ; i <= 100 ; i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
        }

    }
}
