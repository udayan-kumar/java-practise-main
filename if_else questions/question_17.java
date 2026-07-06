
import java.util.*;

//the rate of intrest given to the customer b bank depends on the age and genderof the customer.
//write a java program that takes as input age and gender of customer and generate intrest according to condition

public class question_17 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = ud.nextInt();

        
        String male = "male";
        String  female = "female";

        System.out.print("your gender: ");
        String gen = ud.next() ;


        if(age>=18 && age<=50 && gen.equals(male)){
            System.out.println("rate of intrest: 6.00%");
        }
        else 
            if(age>=18 && age<=50 && gen.equals(female)){
                System.out.println("rate of intrest: 6.5%");
            }
            else 
                if(age>50 && gen.equals(male)){
                 System.out.println("rate of intrest: 6.75%");

                }
                else 
                    if(age>50 && gen.equals(female)){
                        System.out.println("rate of intrest: 7.5%");

                    }
    }
}
