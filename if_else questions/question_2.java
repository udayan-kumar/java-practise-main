//write a java programm to check wether a given number is even and odd

import java.util.Scanner;


public class question_2 {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        System.out.print("enter number: ");
        int num = ud.nextInt();

        if(num%2 == 0){
            System.out.println("even");
        }
         else
            System.out.println("odd");

    }
}
