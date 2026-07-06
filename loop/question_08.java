// check the given number is a perfect number

package loop;

import java.util.Scanner;

public class question_08 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();
        int sum = 0;
        for(int i =1; i<n; i++){
            if(n%i == 0){
                // System.out.print(i);
                sum = sum +i; 

            }
        }
            System.out.println(sum);
            if(sum==n){
                System.out.println("perfect number");
            }else
                System.out.println("not a perfect number");

    }
}
