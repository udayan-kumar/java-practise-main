public class sub_string {
    public static void main(String[] args) {
        String str = "udayan";
        sub("", str, 0);
       
    }

    public static void sub(String ans, String str, int indx){
        if(indx == str.length()) {
            System.out.print(ans + " ");
            return;
        };
        char ch = str.charAt(indx);
       sub(ans + ch, str, indx+1);
       sub(ans, str, indx+1);

    }

}
