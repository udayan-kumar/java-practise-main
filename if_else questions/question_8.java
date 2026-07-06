// write a java program to convert upper lower character to upper case

import java.util.Scanner;



public class question_8 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = ud.nextInt();

        if(num>=97 && num<=122){
            System.out.println((char)(num-32));
        }
        else 
            System.out.println("wrong value");
    }
}
