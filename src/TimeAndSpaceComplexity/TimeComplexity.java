package TimeAndSpaceComplexity;

public class TimeComplexity {
    public static void main(String[] args) {

        // approach 1 here
        /*
        Given an array of size n+1 consisting of integers from 1 to n . one of
        the element is duplicate in the array. Find that duplicate element.
         */
        int[] arr = {5,1,3,4,2,4};
        int n = arr.length;
//        for(int i = 0 ; i < n ; i++){
//            for(int j = i+1 ; j < n ; j++){
//                if(arr[i] == arr[j]) System.out.println("yes found at index " + i + j);
//            }
//        }


        // approach two better
//        boolean[] flag = new boolean[n+1];
//        for(int i = 0 ; i < n ; i++){
//            int ele = arr[i];
//            if(flag[ele] == true) System.out.println("imposter");
//            else flag[ele] = true;
//        }


        // most optimized best approach
        int sum = 0;
        n = n - 1;
        int arrsum = n*(n+1)/2;
        for(int i = 0 ; i <= n ; i++){
            sum += arr[i];
        }
        System.out.println("The imposter is " + (sum - arrsum));
    }
}
