package Arrays;

public class RotateArray {
    public static void revarr(int[] arr , int a , int b){
        int start = a;
        int end = b;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6 , 8 , 1 , 2 , 4 , 9 , 0};
         int d = 3;
         int n = arr.length ;
         d = d % n;
         revarr(arr , 0 , d-1);
         revarr(arr , d , n-1);
         revarr(arr , 0 , n-1);
         for(int a: arr) System.out.print(a + " ");
    }
}
