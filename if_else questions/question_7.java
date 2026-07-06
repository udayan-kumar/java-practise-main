// write a java program to convert upper case character to lower case

import java.util.Scanner;


public class question_7 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter num: ");
        int num = ud.nextInt();

        if(num>=65 && num<=90){
            System.out.println((char)(num+32));
        }else 
            System.out.println("wrong value");

    }
}
