package Project4;
/*  When a bank account pays compound interest, it pays interest not only on the principal amount 
that was deposited into the account, but also on the interest that has accumulated over time. 
Suppose you want to deposit some money into a savings account, and let the account earn compound 
interest for a certain number of years. The formula for calculating the balance of the account 
after a specified number of years is:
A=P(1+rn)ntA=P(1+rn)nt
The terms in the formula are:
�	A is the amount of money in the account after the specified number of years.
P is the principal amount that was originally deposited into the account.
r is the annual interest rate.
n is the number of times per year that the interest is compounded.
t is the specified number of years.
Write a program that makes the calculation for you. The program should ask the user to input 
the following:
�	The amount of principal originally deposited into the account
�	The annual interest rate paid by the account
�	The number of times per year that the interest is compounded (For example,
 if interest is compounded monthly, enter 12. If interest is compounded quarterly, enter 4.)
�	The number of years the account will be left to earn interest
Once the input data has been entered, the program should calculate and display the amount of 
money that will be in the account after the specified number of years. */

import java.util.Scanner;

class Compound_Interest

{

public static void main(String[] args)

{

Scanner kb = new Scanner (System.in);

double P = kb.nextDouble();
double r = kb.nextDouble();
double n = kb.nextDouble();
double t = kb.nextDouble();


system.out.println("Please enter the principal amount deposited:" + P);
system.out.println("Please enter the annual interest rate:" + r);
system.out.println("Please enter the number of times the interest is compounded:" + n);
system.out.println("please enter the specified number of years:" + t);

double A = P*1+r*n*n*t;

system.out.println("The total compound interest is:" + A);


}

}