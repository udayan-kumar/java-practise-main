// write a java program to calculate profit and loss

import java.util.Scanner;


public class question_13 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter sp value: ");
        int sp = ud.nextInt();

        System.out.print("enter cp value: ");
        int cp = ud.nextInt();

        if(sp>cp){
            System.out.println("profit");
            System.out.println("profit value: " + (sp-cp));
        }
        else 
            if(cp>sp){
                System.out.println("loss");
                System.out.println("loss value: " + (cp-sp));
            }
            else 
                System.out.println("no profit no loss");

    }
}
