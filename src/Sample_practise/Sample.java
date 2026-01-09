package Sample_practise;

import java.util.*;
class Sample{
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
        {4,5,6},
        {7,8,9}};
        int sum = 0;

        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            for(int j = arr.length - 1 ; j >= 0 ; j--){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        if(arr.length % 2 != 0){
            sum = sum - (arr[m/2][n/2]);
        }
        System.out.println(sum);
    }






}