package Arrays;

public class SecondMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {4 , 10 ,10 , 6 , 3 , 8};
        int maxElem = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // calculate max
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > maxElem) maxElem = arr[i];
        }

        //calculate second max
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > smax && arr[i] != maxElem) smax = arr[i];
        }
        System.out.println(maxElem);
        System.out.println(smax);
    }
}
