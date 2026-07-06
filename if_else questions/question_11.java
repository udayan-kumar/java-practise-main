
import java.util.Scanner;

//write a java program to read temperature in centigrate and display a suitable message according to trmperature 

public class question_11 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter temperature in centigrated: ");
        int temp = ud.nextInt();

        if(temp<0){
            System.out.println("freezing weather");
        }
        else 
            if(temp>=0 && temp<10){
                System.out.println("very cold weather");
            }
            else 
                if(temp>=10 && temp<20){
                    System.out.println("cold weather");
                }else 
                    if(temp>=20 && temp<30){
                        System.out.println("normal in temperature");
                    }
                    else 
                        if(temp>=30 && temp<40 ){
                            System.out.println("its hot");
                        }
                        else 
                        if(temp>=40){
                            System.out.println("very hot");
                        }
    }
}
