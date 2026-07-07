public class reverse_number {
    public static void main(String[] args) {
        rev(346582376);
    }

    public static int rev(int n){
        if(n<1) return 0;
       int ans = n%10;
       System.out.print(ans + " ");
       return rev(n/10);
    }
}
