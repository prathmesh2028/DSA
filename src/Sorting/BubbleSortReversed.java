package Sorting;

public class BubbleSortReversed {
    public static void print(int[] arr){
        for(int i:arr) System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,0,92,1,8,48,4,27,1};
        int n = arr.length;
        print(arr);
        System.out.println();

        for(int i = 0 ; i < n - 1 ; i++){
            boolean isSorted = true;
            for(int j = 0 ; j < n-1 ; j++){
                if(arr[j] > arr[j+1]){
                    isSorted = false;
                    break;
                }
            }

            if(isSorted) break;

            for(int j = 0 ; j < n - 1 - i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        print(arr);
    }
}
