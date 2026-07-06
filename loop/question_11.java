// reverse the digit of a number

package loop;

import java.util.Scanner;

public class question_11 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();
        int rev= 0;

        for(int i =1; i <=n; i++){
             int digit = n%10;
             rev=rev*10+digit;
            n/=10;
             
        }
            System.out.println(rev);



    }
}
