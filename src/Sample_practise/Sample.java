package Sample_practise;

import java.util.*;
class Sample{
    public static void main(String[] args) {
        int [][] arr = {{1,2,3} , {4,5,6}};
        int a = arr.length;
        int b = arr[0].length;
        printArr(arr);
        int[][] newArr = new int[b][a];
        for(int i = 0 ; i < newArr.length ; i++){
            for(int j = 0 ; j < newArr[0].length ; j++){
                newArr[i][j] = arr[j][i];
            }
        }
        printArr(newArr);
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