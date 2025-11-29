package Arrays;

public class MinimumElementOfTheArray {
    public static void main(String[] args) {
        int[] arr = {-6 , 8 , 14 , -2 , 23 , 47 , -7};
        int minElement = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minElement) minElement = arr[i];
        }
        System.out.println(minElement);
    }
}
