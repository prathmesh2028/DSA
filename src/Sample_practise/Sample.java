package Sample_practise;

import java.util.*;
class Sample{
    public static void main(String[] args) {
        int[] nums = {};
        int n = nums.length;
        int[] arr = {-1,-1};
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(nums[i] == nums[j] && i != j){
                    arr[k] = j;
                    k++;
                }

            }
        }
    }






}