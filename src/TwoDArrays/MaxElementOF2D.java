package TwoDArrays;

public class MaxElementOF2D {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int maxElem = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] > maxElem){
                    maxElem = arr[i][j];
                }
            }
        }
        System.out.println("Max element is " + maxElem);
    }
}
