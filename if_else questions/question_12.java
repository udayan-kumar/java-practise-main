
import java.util.Scanner;

// write a java program to check weather an alphabet is vowel and consonent

public class question_12 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = ud.nextInt();

        if(num==1 || num==5 || num==9 || num==15 || num==21){
            System.out.println("vowel");
        }
        else 
            if(num<=26){
                System.out.println("consonent");
            }
    }
}
