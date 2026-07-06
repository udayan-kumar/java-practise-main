public class equilateral_02_triangle {
    public static void main(String[] args) {
        pattern8(5);
    }
    public static void pattern8(int n){
        int nsp = 0;
        int nstr = 2*n-1;

        for(int row = 1; row<=n; row++){
            for(int col=1; col<=nsp; col++){
                System.out.print("  ");

            }
            for(int col = 1; col<=nstr; col++){
                System.out.print("* ");
            }
            nsp++;
            nstr-=2;
            System.out.println();
        }
    }
}
