package Arrayss.Array_Revised.Two_D_Array;

public class MaxElementOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int maxOfTwoDArray = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(maxOfTwoDArray < arr[i][j]) maxOfTwoDArray = arr[i][j];
            }
        }
        System.out.println(maxOfTwoDArray);
    }
}
