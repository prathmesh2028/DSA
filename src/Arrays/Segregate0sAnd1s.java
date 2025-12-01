package Arrays;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,0,1,1,0};
        int numberOfZeros = 0;
        int numberOf1s = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1) numberOf1s ++;
            else numberOfZeros++;
        }

        for(int i = 0 ; i < numberOfZeros ; i++){
            arr[i] = 0;
        }
        for(int i = numberOfZeros ; i < arr.length ; i++){
            arr[i] = 1;
        }
    }
}
