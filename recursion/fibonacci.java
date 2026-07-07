public class fibonacci {
    public static void main(String[] args) {
        System.out.println(febb(6));
    }

    public static int febb(int n){
        if(n == 0) return n;
        if(n==1) return n;
        return febb(n-1) + febb(n-2);
    }
}
