package Arrays;

public class PlusOne_Leetcode {
    public static void main(String[] args) {
        int [] nums = {1,3,4,5,9};
        nums = plusone(nums);
        for(int ele:nums) System.out.print(ele + " ");

    }
    public static int[] plusone(int[] arr){
        int n = arr.length;
        for(int i = n-1 ; i >= 0 ; i--){
            if(arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] arr2 = new int[n+1];
        arr2[0] = 1;
        return arr2;
    }
}
