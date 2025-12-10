package TwoDArrays;

import java.util.ArrayList;

public class MinimumElementOutOfAllMaximumElementsInAnArray {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,1,2,0},{3,1,5,6}};
        int minElement = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int maxOfRow = 0;
            for(int j = 0 ; j < arr[0].length ; j++){
                if(maxOfRow < arr[i][j]){
                    maxOfRow = arr[i][j];
                }
            }
            minElement = Math.min(minElement , maxOfRow);
        }
        System.out.println(minElement);
    }
}

