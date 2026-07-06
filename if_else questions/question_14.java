// write a java program to input marks of five subject physics , chemistry, biology, mathematics and computer

import java.util.Scanner;


public class question_14 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("physics mark: ");
        double physics = ud.nextDouble();

        System.out.print("chemistry mark: ");
        double chemistry = ud.nextDouble();

        System.out.print("biology mark: ");
        double biology = ud.nextDouble();

        System.out.print("mathematics mark: ");
        double mathematics = ud.nextDouble();

        System.out.print("computer mark: ");
        double computer = ud.nextDouble();

        double percentage = (physics+chemistry+biology+mathematics+computer)/5;

        if(percentage>=90){
            System.out.println("grade A");
        }
        else 
            if(percentage>=80){
                System.out.println("grade B");
            }
            else 
                if(percentage>=70){
                    System.out.println("grade C");
                }
                else 
                    if(percentage>=60){
                        System.out.println("grade D");
                    }
                    else 
                        if(percentage>=40){
                            System.out.println("grade E");
                        }
                        else 
                            System.out.println("FAIL");
                        System.out.println("percentage: " + percentage);

        
    }
}
