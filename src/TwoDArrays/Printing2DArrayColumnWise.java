package TwoDArrays;

public class Printing2DArrayColumnWise {
    public static void main(String[] args) {
//        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,1,2,0},{3,1,5,6}};
        int [][] arr = {{6,0,2,7,6} , {1,3,7,2,2},{9,9,4,5,2}};
        for(int i = 0 ; i < arr[0].length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
