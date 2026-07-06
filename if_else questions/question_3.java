// write s java program to check wether a given number is positive or negitive

import java.util.Scanner;


public class question_3 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: " );
        int num = ud.nextInt();

        if(num>=0){
            System.out.println("positive number");
        }
        else 
            System.out.println("negitive number");
    }
}
