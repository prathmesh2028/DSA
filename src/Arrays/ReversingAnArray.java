package Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9};
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            arr[start] = arr[end];
            start++;
            end--;
        }

        for(int n: arr){
            System.out.println(n);
        }
    }
}
