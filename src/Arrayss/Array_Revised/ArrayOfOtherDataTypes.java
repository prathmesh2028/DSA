package Arrayss.Array_Revised;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        double[] arr = new double[8];
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        char[] arr1 = new char[8];
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print(arr1[i] + " ");
        }



        String[] arr2 = {"Prathmesh" , "unknown" , "Tanushree"};
        for(int i = 0 ; i < arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        
    }
}
