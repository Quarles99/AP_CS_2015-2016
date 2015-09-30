import java.io.*;
import java.util.Scanner;

//I think it is saying that the scanners are not working properly, but
//they work fine when I run them on my computer.
//I was wondering if you had any ideas

class Assignment2 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);

        double cost;
        double paid;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        double change;

        System.out.println("Please Enter the Cost of the Item: ");
        cost = scan.nextDouble();

        System.out.println("Please enter the Amount Paid: ");
        paid = scan.nextDouble();

        change = paid - cost;
        System.out.println("Change Owed: " + change);

        quarters = (int)(change / 0.25);
        change = change - (quarters * 0.25);
        dimes = (int)(change / 0.10);
        change = change - (dimes * 0.10);
        nickels = (int)(change / 0.05);
        change = change - (nickels * 0.05);
        pennies = (int)(change / 0.01);

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);




    }
}
