package Pattern_Printing.Homework;

import java.util.Scanner;

public class SquareNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row , col;
        System.out.print("Enter the number of rows :");
        row = sc.nextInt();
        System.out.print("Enter the number of columns :");
        col = sc.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
