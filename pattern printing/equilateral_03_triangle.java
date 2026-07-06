public class equilateral_03_triangle {
    public static void main(String[] args){
        patter9(5);
    }
    public static void patter9(int n){
        int nspc = n-1; 
        int nstr = 1;

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=nspc; col++){
                System.out.print(" ");
            }
            for(int col = 1; col<=nstr; col++){
                System.out.print("* ");
        
            }
            
            
            nspc--;
            nstr+=1;
            System.out.println();
        }
    }
}
