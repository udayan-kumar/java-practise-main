// a shoping app offers a 10% discount if the shopping card total is over 100 . if the user has a "VIP" promo code , they get 20% off instead (discount don't stack ). write the logic to calculate the final price.

import java.util.Scanner;


public class question_19 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("shopping cart total is: ");
        double amount = ud.nextDouble();

        System.out.print("promocode: ");
        String code = ud.next();
        String promocode = "VIP";
        String value = new String("VIP");
        String newpromocode = "VIP";

        if(amount>100){
            
            System.out.print("final price: " + (amount - (amount*10)/100));
        }
        else 
            if(promocode.equalsIgnoreCase(newpromocode)){
                System.out.print("final price: " + (amount - ((amount*20)/100)  ));
            }
    }
}
