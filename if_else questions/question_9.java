
import java.util.Scanner;

//write a program to check wether a character is alphabet or not

public class question_9 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the value: ");
        int num = ud.nextInt();

        if(num>=65 && num<=90 || num>=97 && num<=122){
            System.out.println("character of alphabet");
        }
        else 
            System.out.println("not alphabet character");
    }
}
