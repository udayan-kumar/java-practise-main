
import java.util.Scanner;

// write a java program to input electricity unit charges and calculate total electricity bill

public class question_16 {
    public static void main(String[] args) {
        Scanner ud  = new Scanner(System.in);

        System.out.print("enter electricity unit: ");
        double unit = ud.nextDouble();

        if(unit<=50){
             System.out.println("electricity bill: " + (unit)*0.50);

        }
        else 
            if(unit<=150){
                System.out.println("electricity bill: " +(unit)*0.75);
            }
            else 
                if(unit<=250){
                    System.out.println("electricity bill: " +(unit)*1.20);
                }
                else 
                    if(unit>250){
                        System.out.println("electricity bill: " +(unit)*1.50 + ((unit)*20)/100);
                    }
    }
}
