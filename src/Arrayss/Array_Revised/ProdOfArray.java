package Arrayss.Array_Revised;

public class ProdOfArray {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int prod = 1;
        for(int i = 0 ; i < x.length ; i++)
        {
            prod *= x[i];
        }
        System.out.println(prod);
    }
}
