package Sample_practise;

import java.util.*;
class Sample{
    public static void main(String[] args) {
        int[][] matrix = {{1,1}};
        int target = 2;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(j >= 0 && i < m){
            if(matrix[i][j] == target){
                System.out.print("true");
                break;
            }
            else if(matrix[i][j] > target){
                j--;
            }
            else if(matrix[i][j] < target){
                i++;
            }
        }

        printArr(matrix);

    }
    public static void printArr(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}