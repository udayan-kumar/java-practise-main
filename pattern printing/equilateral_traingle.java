public class equilateral_traingle {
    public static void main(String[] args) {
        pattern5(5);
    }
    public static void pattern5(int n){
        for(int row=1; row <=2*n-1; row++){
            if(row<=5){
                for(int col =1; col<=row; col++){
                    System.out.print("* ");
                }
                
            }
            else 
                if(row>5){
                    for(int col =0 ; col<=2*n-row-1; col++){
                        System.out.print("* ");
                    }
                }
                System.out.println();
        }
    }
}
