// print all natural number from n down to 1

package loop;

import java.util.Scanner;

public class question_02 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        
        System.out.print("enter the nmber: ");
        int n = ud.nextInt();

            for(int i = n; i>=1; i--){
                System.out.println(i);
            }
        
    }
}
