//write a java program to check wether a number is divisible by 5 and 11 or not

import java.util.Scanner;


public class question_4 {
    public static void main(String[] args) {
        Scanner ud  = new Scanner (System.in);

        int num = ud.nextInt();

        if(num%5 == 0 && num%11 == 0){
            System.out.println("yes divisible by 5 and 11");
        }
        else 
            System.out.println("not divisible by 5 and 11");
    }
}
