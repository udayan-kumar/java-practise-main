public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binary(arr, 11, 0, arr.length-1));
    }

    public static boolean binary(int[] arr, int target, int low, int high){
        int mid = (low + high)/2;
        if(low > high) return false;
        if(arr[mid] == target) return true;
        if(arr[mid] > target) return binary(arr, target, low, mid -1);
        if(arr[mid] < target) return binary(arr, target, mid+1, high);
        return binary(arr, target, low, high);
    }
}
