public class border_triangle {
public static void main(String[] args) {
    pattern12(5);
}

public static void pattern12(int n){
    int star = 1; 
    int space= n;

    for(int row = 1; row<=n; row++){
        for(int col =1; col<=space; col++){
            System.out.print(" ");
        }
        for(int col =1; col<=(2*n)-1; col++){
            if(col%2==0){
                for(int midspace =1; midspace<=star; midspace++){
                    System.out.print("* ");
                }
            }
        }
        star++;
        space--;
        System.out.println();
    }
}
}
