package Arrays.Basic;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,17,16,11,13};
        int sum = 1;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i ; j < arr.length ; j++)
            {
                if((arr[i] + arr[j]) == sum)
                {
                    System.out.println("Two vales are " + arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
