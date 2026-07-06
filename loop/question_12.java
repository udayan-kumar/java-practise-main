// check if a number reads same backward as forward

package loop;

import java.util.Scanner;

public class question_12 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();
        int rev = 0;
        int originalnum = n;

        while(n!=0){
            int digit = n%10;
            rev= rev*10 + digit;
            n = n/10;
        }
        System.out.println(rev);
        // System.out.println(n);

        
        if(rev == originalnum){
            System.out.println("palindrome");
        }
        else System.out.println("not a palindrome");
    }
}
