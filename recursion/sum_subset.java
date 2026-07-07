public class sum_subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        sub(arr, 0, 0);
    }

    public static void sub(int[] arr, int ans, int indx ){
        if(indx == arr.length){
            System.out.println(ans);
            return ;
        }
        int sum = arr[indx];
        sub(arr , ans+ sum, indx+1);
        sub(arr, ans, indx+1);


    }
}
