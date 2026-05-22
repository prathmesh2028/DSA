package Arrays.Basic;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {-6,-8,14,-2,23,47,4,3,10};
        int min = Integer.MAX_VALUE;
//        System.out.println(min);
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
