//write a java program to input basic salary of an employ and calculate its gross salary 

import java.util.Scanner;


public class question_15 {
    public static void main(String[] args) {
        Scanner ud  = new Scanner(System.in);

        System.out.print("basic salary: ");
        double salary = ud.nextDouble();

        if(salary<=10000){
            double amount = salary + ((salary)*20)/100 + ((salary)*80)/100;
            System.out.println(amount);
        }
        else 
            if(salary<=20000){
                double amount = salary + ((salary)*25)/100 + ((salary)*90)/100;
                System.out.println(amount);
            }
            else 
                if(salary>20000){
                     double amount = salary + ((salary)*30)/100 + ((salary)*95)/100;
                     System.out.println(amount);
                }
    }
}
