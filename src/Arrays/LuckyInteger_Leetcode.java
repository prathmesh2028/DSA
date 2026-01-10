package Arrays;

public class LuckyInteger_Leetcode {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        int n = arr.length;
        int maxlucky = -1;
        boolean[] flag = new boolean[n];
        for(int i = 0; i < n ; i++){
            if(flag[i]) continue;
            int count = 1;
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    flag[j] = true;
                    count++;
                }
            }
            if(arr[i] == count){
                maxlucky = Math.max(maxlucky , count);
            }
        }
        System.out.println(maxlucky);
    }
}
