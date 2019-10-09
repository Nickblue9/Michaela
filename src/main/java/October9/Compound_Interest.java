package October9;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String args[] ) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Initial Deposit: ");
        double principal = input.nextDouble();

        System.out.print("Enter Annual Intrest Rate: ");
        double interestRate = input.nextDouble()/100;

        System.out.print("Enter Number of Times Compounded Annually: ");
        int compoundTimes = input.nextInt();

        System.out.print("Enter Number of Years: ");
        int years = input.nextInt();

        double amount = principal*Math.pow((1+interestRate/compoundTimes),compoundTimes*years);

        System.out.println("The account will have $"+amount+" in "+years+" years.");


    }
}
