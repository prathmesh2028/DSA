package Sorting;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,0,4,3,2,8,10};
        int target = 9;
        int n = arr.length;

        //using the two pointer approach
        int i = 0 , j = n-1;
        while(i <= j){
            int sum = arr[i]  + arr[j];
            if(sum > target) j--;
            else if(sum < target) i++;
            else if(sum == target) {
                System.out.print(i + " " + j);
                break;
            }
        }
    }
}
