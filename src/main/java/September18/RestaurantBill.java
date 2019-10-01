package September18;


/*
Write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter the
charge for the meal. The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total after
adding the tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.
 */

import java.util.Scanner; //Tells computer to use the Scanner, a way to get input from a specified location

class RestaurantBill {
    public static void main(String args[]){

        //Initialize scanner to the variable kb and place it in System, meaning that it will get the input from a user
        //when the code runs
        Scanner kb = new Scanner(System.in);

        /*
        Prompt the user to enter the total bill.  To do this you use a System.out.print instead of println because
        println will automatically return the line after that line is run, making it look weired.  Then you want to make
        a new variable "bill" and set it equal to the next double received by the scanner initialized above.  Note, if
        you do not enter a double where prompted here it will cause an error saying that you need to enter a double.
         */
        System.out.print("Please enter the total bill: ");
        double bill = kb.nextDouble();

        /*
        Calculate the tax.  According to the problem, it should be a 6.75% of the total charge
         */

        double tax = bill*0.06675;

        /*
        Calculate the tip, According to the problem, you are tipping 20% after tax
         */

        double tip = (bill+tax)*.2;

        System.out.println("The meal charge is: "+bill);
        System.out.println("The tax amount is: "+tax);
        System.out.println("The tip amount is: "+tip);
        System.out.println("The total cost is: "+(bill+tip+tax));
    }
}
