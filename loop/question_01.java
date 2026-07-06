// print all natural number from 0 to n

package loop;

import java.util.Scanner;

public class question_01 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the value: ");
        int n = ud.nextInt();

        for(int i =1; i<=n; i++){
            System.out.println(i);
        }
    }
}
