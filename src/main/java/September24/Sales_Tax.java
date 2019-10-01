package September24;
/* Write a program that will ask the user to enter the amount of a purchase.
The program should then compute the state and county sales tax. 
Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
The program should display the amount of the purchase, the state sales tax, 
the county sales tax, the total sales tax, and the total of the sale 
(which is the sum of the amount of purchase plus the total sales tax).
Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent. */

import java.util.Scanner;

public class Sales_Tax {
    public static void main(String args[]) {

        Scanner kb = new Scanner(System.in);
        double state_sales_tax = .04, county_sales_tax = .02;


        System.out.print("Please enter total purchase amount: ");
        double purchase_amount = kb.nextDouble();

        double total_state_sales_tax = purchase_amount * state_sales_tax;

        double total_county_sales_tax = purchase_amount * county_sales_tax;
        double total_tax = total_state_sales_tax +
                total_county_sales_tax;
        double total_bill = purchase_amount + total_tax;
        System.out.println("The amount of purchase is:" + purchase_amount);
        System.out.println("The state sales tax is:" + total_state_sales_tax);
        System.out.println("The county sales tax is:" + total_county_sales_tax);
        System.out.println("The total sales tax is:" + total_tax);
        System.out.println("The total bill is:" + total_bill);

    }

}
