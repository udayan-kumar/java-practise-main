// count total digit of a integer

package loop;

import java.util.Scanner;

public class question_09 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.println("enter number: ");
        int n = ud.nextInt();
        int count = 0;
        for(int i =0; i<=n ; i++){
           n/=10;
           count++;

        }

        // while(n!=0){
        //     n/=10;
        //     count++;
        // }
        System.out.println(count);

    }
}
