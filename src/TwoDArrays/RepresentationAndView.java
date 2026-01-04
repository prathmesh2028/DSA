package TwoDArrays;

import java.util.Scanner;

public class RepresentationAndView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        System.out.print("m :");
        int m = sc.nextInt();
        System.out.print("n :");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ;j < n ; j++){
                System.out.print("Enter the element at index " + i + " " + j + " :");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
