package Sorting;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {8,4,1,5,9,8,2,3,6,7};
        int k = 3;
        int n = arr.length;

        for(int i = 0 ; i < k ; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for(int i : arr) System.out.print(i + " ");
        System.out.println(arr[k-1]);
    }
}
