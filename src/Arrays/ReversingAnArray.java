package Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        // two variable / pointer approach
        int[] arr = {6,8,1,2,4,9};
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

        for(int n: arr){
            System.out.println(n);
        }
    }
}
