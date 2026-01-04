package TwoDArrays;

public class MinElemOutOfAllMaxElemOfRow {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};
        int minOutOfMax = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int maxElem = Integer.MIN_VALUE;
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] > maxElem) maxElem = arr[i][j];
            }
            minOutOfMax = Math.min(maxElem , minOutOfMax);
//            System.out.println(maxElem);
        }
        System.out.println(minOutOfMax);
    }
}
