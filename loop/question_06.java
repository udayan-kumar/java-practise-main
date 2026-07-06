// print the given number is a prime number or composite number

package loop;

import java.util.Scanner;

public class question_06 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();

        for(int i =2; i<n-1 ;i++){
            if(n % i != 0) {
                System.out.println("prime number");
                break;
            }
            else 
            {
                System.out.println("composite number");
                break;
            }
            

        }
    }
}