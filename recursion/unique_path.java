public class unique_path {
    public static void main(String[] args) {
        System.out.println(path(3, 3));
    }

    public static int path(int n , int m){
        if(n ==1 || m == 1) return 1;
        return path(n-1, m) + path(n, m-1);

    }
}
