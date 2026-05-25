package Arrays.Basic;

public class SecondMaInArray {
    public static void main(String[] args) {
        int[] arr = {4,10,10,6,3,8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if((arr[i] > max)) max = arr[i];
        }
        System.out.println(max);
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] != max && (arr[i] > smax)) smax = arr[i];
        }
        System.out.println(smax);
    }
}
