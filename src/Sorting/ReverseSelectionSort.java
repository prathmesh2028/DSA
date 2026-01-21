package Sorting;

public class ReverseSelectionSort {
    public static void main(String[] args) {
        int [] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int max = Integer.MIN_VALUE, maxindex = -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }

        for(int e:arr) System.out.print(e + " ");
    }
}
