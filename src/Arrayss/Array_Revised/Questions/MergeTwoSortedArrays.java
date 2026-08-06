package Arrayss.Array_Revised.Questions;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,5,6,9};
        int[] b = {1,3,4,5,7,8};
        int[] c = mergeTwoSortedArrays(a,b);
        System.out.println(Arrays.toString(c));

    }
    public static int[] mergeTwoSortedArrays(int[] arr1 , int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] c = new int[n1 + n2];

        // 3 pointer technique
        int i = 0 , j = 0 , k = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                c[k] = arr1[i];
                i++;
                k++;
            }
            else if (arr1[i] > arr2[j])
            {
                c[k] = arr2[j];
                k++;
                j++;
            }
            else if (arr1[i] == arr2[j])
            {
                c[k] = arr2[j];
                k++;
                j++;
                c[k] = arr1[i];
                i++;
            }

        }
        while(i < arr1.length)
        {
            c[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length)
        {
            c[k] = arr2[j];
            j++;
            k++;
        }


        return c;
    }
}
