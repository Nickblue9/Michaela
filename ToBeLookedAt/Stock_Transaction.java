/*Write a program that displays the following information:
•	The amount of money Joe paid for the stock.
•	The amount of commission Joe paid his broker when he bought the stock.
•	The amount that Joe sold the stock for.
•	The amount of commission Joe paid his broker when he sold the stock.
•	Display the amount of profit that Joe made after selling his stock
and paying the two commissions to his broker. (If the amount of profit
that your program displays is a negative number, then Joe lost money
on the transaction.)*/ 

import java.util.Scanner;

public class Stock_Transaction

{

public static void main(String[] args)

{

double TotalShares Purchased = 1000;
double Price per Share = 32.87;
double Total Shares Cost = Total Shares Purchased *
Price per Share;
int First Stockbroker Commission Percentage = 0.02;
double First Stockbroker Commission Paid = Total Shares Cost * First Stockbroker Commission Percentage;

double Shares Sold = 1000;
double Income per Share = 33.92;
double Total Income = Shares Sold * Income per Share; 
int Second Stockbroker Commission Percentage = 0.02;
double Second Stockbroker Commission Paid = Total Income * Second Stockbroker Commission Percentage;
double Total Stockbroker Commissions Paid = First Stockbroker Commission Paid + 
Second Stockbroker Commission Paid;
double Total Losses = Total Shares Cost + Total Stockbroker Commissions Paid;
double Final Transaction Total = Total Income - Total Losses; 

system.out.println("Total Cost of Stock:" + Total Shares Cost);
system.out.println("Total Commission Payment After Stock Purchase:" + First Stockbroker Commission Paid);
system.out.println("Total Stock Sales:" + Total Income);
system.out.println("Total Commission Paid After Sale:" + Second Stockbroker Commission Paid);
system.out.println("Total Profit:" + Total Transaction Total);

}

}