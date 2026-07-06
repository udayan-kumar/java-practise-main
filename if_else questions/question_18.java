// write a program in java to print the electricity bill of the customer based on the meter reading given by the user. programm accept the name and the reading given by the user, compute the bill amount and print the bill

import java.util.Scanner;


public class question_18 {
    public static void main(String[] args) {
        System.out.println("MPSEB");

        Scanner ud = new Scanner(System.in);
        System.out.print("name of the customer: ");
        String customername = ud.next();

        String name = "udayan";

        System.out.print("reading of the meter: ");
        int reading = ud.nextInt();

        if(reading<=200){
            System.out.println("bill for the month: january" );
            System.out.println("fixed rent: 250/- per month");
            System.out.println("amount of counsumed unit: " + (reading * 65));
            System.out.println("customer name: " + (customername));
            System.out.println("total unit consumed: " + reading);
            System.out.println("total bill amount: " + (250 +(reading * 65)) );

        }
        else 
            if(reading>=201 && reading<=400){
                System.out.println("bill for the month: january" );
                System.out.println("fixed rent: 250/- per month");
                System.out.println("amount of counsumed unit: " + (reading * 80));
                System.out.println(("customer name: ") + (customername));
                System.out.println("total unit consumed: " + reading);
                System.out.println("total bill amount: " + (250 +(reading * 80)) );
            }
            else {
                System.out.println("bill for the month: january" + "\nfixed rent: 250/- per month" + "\namount of counsumed unit: " + (reading * 120) + "\ncustomer name:" + (customername) + "\ntotal unit consumed: " + reading + "\ntotal bill amount:" +(250 +(reading * 120)) );
                // System.out.println("fixed rent: 250/- per month");
                // System.out.println("amount of counsumed unit: " + (reading * 120));
                // System.out.println("customer name: " + (customername));
                // System.out.println("total unit consumed: " + reading);
                // System.out.println("total bill amount: " + (250 +(reading * 120)) );
            }


    }
}
