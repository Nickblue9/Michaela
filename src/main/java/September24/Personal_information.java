package September24;

import java.util.Scanner;

public class Personal_information {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = input.nextLine();

        System.out.print("Enter Major: ");
        String major = input.nextLine();

        System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phone+"\nMajor: "+major);
    }
}
