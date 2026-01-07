public class Main{
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        int n = nums.length;
        int count = 0;
        int rc = 0;
        for(int i= 0 ; i < n ; i++){
            count = 0;
            int temp = nums[i];
            while(temp > 0){
                int digit = temp % 10;
                temp /= 10;
                count++;
            }
            if(count % 2 == 0){
                rc++;
            }
        }
        System.out.println(rc);
    }
}