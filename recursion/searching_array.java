public class searching_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 11, 0));
    }

    public static boolean search(int[] arr, int target, int indx){
        if(indx == arr.length) return false;
        if(arr[indx] == target) return true;
        return search(arr, target, indx+1);
    }
}
