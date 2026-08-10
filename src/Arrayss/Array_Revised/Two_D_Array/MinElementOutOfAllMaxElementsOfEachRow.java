package Arrayss.Array_Revised.Two_D_Array;

import java.util.ArrayList;

public class MinElementOutOfAllMaxElementsOfEachRow {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};

        int MinElementOutOfAllMaxElementsOfEachRow = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++)
        {
            int maxOfRow = Integer.MIN_VALUE;
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] > maxOfRow) maxOfRow = arr[i][j];
            }
            if(MinElementOutOfAllMaxElementsOfEachRow > maxOfRow) MinElementOutOfAllMaxElementsOfEachRow = maxOfRow;
        }
        System.out.println(MinElementOutOfAllMaxElementsOfEachRow);

    }
}
