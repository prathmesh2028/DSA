package Arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {44,34,73,83,84,26,84,997};
        System.out.print("Enter the element to search in array :");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target) found = true;
        }
        if(found) System.out.println("Element found in the array");
        else System.out.println("Element not found in the array");

    }
}
