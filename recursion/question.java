public class question {
    public static void main(String[] args) {
       print(0,5);
    }

    public static void print(int x ,int n){
        if(x > n) return;
        System.out.println(x);
        print(x+1,n);
    }
}
1:07