package If_Else;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double coast_price , selling_price;
        System.out.print("Enter the coast price of the item :");
        coast_price = sc.nextDouble();
        System.out.print("Enter the selling price of the item :");
        selling_price = sc.nextDouble();
        if(coast_price < selling_price){
            System.out.println("The seller have made the profit....!");
            System.out.println("The profit amount is :" + (selling_price - coast_price));
            System.out.println("Profit % is :" + ((selling_price - coast_price)/selling_price)*100);
        }
        else if (coast_price == selling_price) System.out.println("No loss and no profit to the seller");
        else if(coast_price > selling_price){
            System.out.println("The seller has made loss");
            System.out.println("loss amount is :" + (coast_price - selling_price ));
            System.out.println("Loss % is " + ((coast_price - selling_price)/coast_price)*100);
        }
        else System.out.println("Something went wrong...!");

    }
}
