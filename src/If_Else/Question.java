package If_Else;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double coastprice , sellingprice;
        System.out.print("Enter the coast price of the item :");
        coastprice = sc.nextDouble();
        System.out.print("Enter the selling price of the item :");
        sellingprice = sc.nextDouble();

        double amount = sellingprice - coastprice;
        if ( amount > 0)
        {
            System.out.print("The user have made the profit");
            System.out.print("Profit % is " + (coastprice/sellingprice) * 100);
        }
        else if ( amount < 0)
        {
            System.out.println("The user have made the loss");
            System.out.print("Loss % is " + (sellingprice/coastprice) * 100);
        }
        else if(amount == 0)
        {
            System.out.println("No profit and no loss here in the transaction :)");
        }
    }
}
