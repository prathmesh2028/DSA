package Sorting.Sorting_Revised;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};
        print(arr);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length-1-i ; j++)
            {
                if(arr[j+1] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int[] a)
    {
        for(int i:a) System.out.print(i + " ");
    }
}
