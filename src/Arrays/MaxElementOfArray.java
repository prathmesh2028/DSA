package Arrays;

public class MaxElementOfArray {
    public static void main(String[] args) {
        int[] arr = {-6 , 8 , 14 , -2 , 23 , 47 , -7};
        int maxElem = arr[0];

        //or
//        int maxElem = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > maxElem) maxElem = arr[i];
        }
        //optimized way to do so
//        for (int j : arr) {
//            if (j > maxElem) {
//                maxElem = j;
//            }
//        }
        System.out.println("The max element of array is :" + maxElem);


        // product of all element of array
//        int prod = 1;
//        for (int i = 0 ; i < arr.length ; i++){
//            prod *= arr[i];
//        }
//        System.out.println("The product of all elements is " + prod);
    }
}
