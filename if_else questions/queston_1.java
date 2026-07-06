// write a java programm to accept two integer and check whether the are eual are not

import java.util.Scanner;

public class queston_1 {
public static void main(String[] args) {
        Scanner ud  = new Scanner(System.in);

        System.out.print("enter a: ");
        int a  = ud.nextInt();

        System.out.print("enter b: ");
        int b = ud.nextInt();

        if(a == b){
            System.out.println("both are equal");
        }else
            System.out.println("both are not equal");
    }
}
