//write a java program to find wether a given number is leap year or not

import java.util.Scanner;


public class question_5 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
            int num = ud.nextInt();

            if(num%4 == 0 || num%400 == 0){
                System.out.println("leap year");
            }
            else 
                System.out.println("not a leap year");
    }
}
