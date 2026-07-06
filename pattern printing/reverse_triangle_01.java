public class reverse_triangle_01 {
public static void main(String[] args) {
    pattern10(5);
}
public static void pattern10(int n){
    int space = 1;
    int star = n; 

    for(int row =1; row<=n; row++){
        for(int col =1; col<=space; col++){
            System.out.print(" ");
        }
        for(int col =1; col<=star; col++){
            System.out.print("* ");
        }
        star--; 
        space++;
        System.out.println();
    }
}
}
