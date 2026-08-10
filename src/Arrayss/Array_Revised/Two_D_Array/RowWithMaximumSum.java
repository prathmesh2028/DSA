package Arrayss.Array_Revised.Two_D_Array;

public class RowWithMaximumSum {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{3,1,8,2,6}};

        int maxsum = Integer.MIN_VALUE;
        int maxrow = -1;
        for(int i = 0 ; i < arr.length ; i++)
        {
            int sum = 0;
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                sum += arr[i][j];
            }
            if(sum > maxsum)
            {
                maxsum = sum;
                maxrow = i;
            }
        }
        System.out.println(maxsum);
        System.out.println(maxrow);
    }
}