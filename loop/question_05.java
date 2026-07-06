// find the factorial of given number

package loop;

import java.util.Scanner;

public class question_05 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number");
        int n = ud.nextInt();
        int digit = 1;

        for(int i =1; i<=n; i++){
            digit*=i;
        }
        System.out.println(digit);
    }
}
