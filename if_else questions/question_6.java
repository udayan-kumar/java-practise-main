
import java.util.Scanner;

// write a java program to read the age of candidate and determine wether it is eligible for casting his/her own vote

public class question_6 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("your age: ");
        int age = ud.nextInt();

        if(age>=18){
            System.out.println("eligible for giving his/her vote");
        }
        else 
            System.out.println("not eligible for giving his/her vote");
    }
}
