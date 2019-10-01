package September18;


/*
Write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter the
charge for the meal. The tax should be 6 percent of the meal charge. The tip should be a percent entered by the user,
of the total after
adding the tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.
 */

import java.util.Scanner;

class RestaurantBill_2 {
    public static void main(String args[]){

        //Initialize scanner to the variable kb and place it in System, meaning that it will get the input from a user
        //when the code runs
        Scanner kb = new Scanner (System.in);

        /*
        Prompt the user to enter the total bill.  To do this you use a System.out.print instead of println because
        println will automatically return the line after that line is run, making it look weired.  Then you want to make
        a new variable "bill" and set it equal to the next double received by the scanner initialized above.  Note, if
        you do not enter a double where prompted here it will cause an error saying that you need to enter a double.
         */
        System.out.print("Please enter the total bill: ");
        double bill = kb.nextDouble ();

        /*
        Calculate the tax.  According to the problem, it should be a 6% of the total charge
         */

        double tax = bill*0.06;

        /*
        Calculate the tip, According to the problem, you are tipping a user entered amount
         */

        System.out.print("Please enter tip amount: ");
       
        double tip = kb.nextDouble();
        tip = (tax+bill)*tip;

        System.out.println("The meal charge is: "+bill);
        System.out.println("The tax amount is: "+tax);
        System.out.println("The tip amount is: "+tip);
        System.out.println("The total cost is: "+(bill+tip+tax));
    }
}
