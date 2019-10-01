package September24;
/*Write a program that displays the following information:
�	The amount of money Joe paid for the stock.
�	The amount of commission Joe paid his broker when he bought the stock.
�	The amount that Joe sold the stock for.
�	The amount of commission Joe paid his broker when he sold the stock.
�	Display the amount of profit that Joe made after selling his stock
and paying the two commissions to his broker. (If the amount of profit
that your program displays is a negative number, then Joe lost money
on the transaction.)*/

import java.util.Scanner;

public class Stock_Transaction {

    public static void main(String[] args) {

        double totalSharesPurchased = 1000;
        double ppr = 32.87;
        double totalSharesCost = totalSharesPurchased * ppr;
        double commissionPaid = totalSharesCost *0.02;

        double sharesSold = 1000;
        double incomePerShare = 33.92;
        double totalIncome = sharesSold * incomePerShare;
        double secondCommissionPaid = totalIncome * 0.02;


        double totalCommissionPaid = commissionPaid + secondCommissionPaid;
        double totalLoses = totalSharesCost +totalCommissionPaid;
        double transactionTotal = totalIncome - totalLoses;

        System.out.println("Total Cost of Stock: " + totalSharesCost);
        System.out.println("Total Commission Payment After Stock Purchase: " + commissionPaid);
        System.out.println("Total Stock Sales: " + totalIncome);
        System.out.println("Total Commission Paid After Sale: " + secondCommissionPaid);
        System.out.println("Total Profit: " + transactionTotal);

    }

}