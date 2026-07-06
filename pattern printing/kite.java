public class kite {
     public static void main(String[] args) {
        pattern6(5);
    }
    public static void pattern6(int n){
        int nspc = n-1;
        int nstr = 1;

        for(int row =2*n- 1; row<=n; row++ ){
            if(n<5){
                for(int col = 1; col<=nspc; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=nstr;col++ ){
                System.out.print("* ");
            }
            nspc--;
            nstr+=2;
            System.out.println();
            }else 
                {
                for(int col = 1; col<=nspc; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=nstr;col++ ){
                System.out.print("* ");
            }
            nspc++;
            nstr-=2;
            System.out.println();

        }


        // for(int row = 1; row<=n; row++ ){
        //     for(int col = 1; col<=nspc; col++){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col<=nstr;col++ ){
        //         System.out.print("* ");
        //     }
        //     nspc--;
        //     nstr+=2;
        //     System.out.println();
        // }
        

    }


