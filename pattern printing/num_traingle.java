public class num_traingle {
    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern4(int n){
        for(int row = 1; row<=n; row++){
            System.out.print("* ");
            for(int col =1 ; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
