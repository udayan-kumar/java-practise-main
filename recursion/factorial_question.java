public class factorial_question {
    public static void main(String[] args) {
        int n = 5;
       System.out.println( fac(n));
    }

    public static int fac(int n){
        if(n == 0) return 1;
        // int ans = n*fac(n-1);
       return n*fac(n-1);
      
    }
}
