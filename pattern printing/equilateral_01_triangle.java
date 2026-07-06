public class equilateral_01_triangle {
    public static void main(String[] args) {
        pattern7(5);
    }
    public static void pattern7(int n){
        int nspc = n-1;
        int nstr = 1;

        for(int row = 1; row<=n; row++){
            for(int col=1; col<=nspc; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=nstr; col++){
                System.out.print("* ");
            }
            nspc--;
            nstr+=2;
            System.out.println();
        }
    }
}
