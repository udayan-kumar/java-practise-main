public class two_down_triangle {
public static void main(String[] args) {
    pattern11(5);
}

public static void pattern11(int n){
    int star = n;
    int space = 1;

    for(int row =1; row<=n; row++){
        for(int col =1; col<=space; col++ ){
            System.out.print(" ");
        }
        for(int col =1; col<=star; col++){
            System.out.print("* ");
        }
        star--; 
        space++;
        System.out.println();
    }
    space= n; 
    star = 1;

    for(int row = 1; row<=n; row++){
        for(int col =1; col<=space; col++){
            System.out.print(" ");
        }
        for(int col =1; col<=star; col++){
            System.out.print("* ");
        }
        star++;
        space--;
        System.out.println();
    }
}
}
