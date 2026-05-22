package Arrays.Basic;

import java.math.BigInteger;

public class ProductsOfElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 5, 6, 78, 99};
        int prod = 1;
        for(int i = 0 ; i < arr.length ; i++)
        {
            prod *= arr[i];
        }
        System.out.println(prod);
    }
}
