// calculate the sum of first natural number 

package loop;

import java.util.Scanner;

public class question_04 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = ud.nextInt();
            
            int sum = 0;

        // for(int i =1; i<=n;i++){
        //      digit+=i;
        // }
        // System.out.println(digit);

        while(n!=0){
            int digit = n%10;
            sum = sum +digit;
        }
        System.out.println(sum);
    }

}
