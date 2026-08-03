package Arrayss.Array_Revised.Basic;

public class Printing_Array {
    public static void main(String[] args) {
        int[] arr = {5,-8,2,27,43,67};

        // using for loop
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // using while loop
//        int i = 0;
//        while(i < arr.length)
//        {
//            System.out.print(arr[i] + " ");
//            i++;
//        }



        int[] pb = new int[55];
        for(int i = 0 ; i < pb.length ; i++)
        {
            System.out.print(pb[i] + " ");
        }
    }

}
