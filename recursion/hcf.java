
public class hcf {
    public static void main(String[] args) {
        System.out.println(gcd(39, 131));
    }

    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        };
        int ans = a%b;
        return gcd(b, ans);
    }
}
