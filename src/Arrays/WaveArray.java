package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8};
        int n = arr.length;
        for(int i = 0 ; i < n ; i+=2){
            if(arr[i] == arr[n-1]) ;
            else{
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i : arr) System.out.println(i);
    }
}
