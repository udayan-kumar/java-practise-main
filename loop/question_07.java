// print all the factor of a given number

package loop;

import java.util.Scanner;

public class question_07 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();
        
        
        for(int i = 1; i<=n ; i++){
             if(n%i ==0){
                System.out.println(i);
             }
        }
    }
}
