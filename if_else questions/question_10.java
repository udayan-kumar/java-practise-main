
import java.util.Scanner;

// write a java program to find the largest of three number 

public class question_10 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter your number: ");
        int a = ud.nextInt();

        System.out.print("enter your number: ");
        int b = ud.nextInt();

        System.out.print("enter your number: ");
        int c = ud.nextInt();


        if(a>b && a>c){
            System.out.println(a);
        }else 
            if(b>a && b>c){
                System.out.println(b);
            }
            else 
                System.out.println(c);
    }
}
