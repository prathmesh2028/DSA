package Arrayss.Array_Revised.Two_D_Array;

public class SumOf2DArray {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{1,1,1,1} , {2,2,2,2} , {3,3,3,3}};
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
