package Sample_practise;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,1,2,0},{3,1,5,6}};
        int minElement = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int maxElem = 0;
            for(int j = 0 ; j < arr[0].length ; j++){
                if(maxElem < arr[i][j]){
                    maxElem = arr[i][j];
                }
            }
            minElement = Math.min(minElement , maxElem);
        }
        System.out.println(minElement);
    }
}
