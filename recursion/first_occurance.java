public class first_occurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,5,5,6,7,8,9};
        System.out.println(occ(arr, 4, 0, arr.length-1));
    }

    public static int occ(int[] arr , int target, int low , int high){
        int mid = (low + high)/2;
        int firocc = 0;
        if(low > high) return 0;
        if(arr[mid] == target) {
            int left = occ(arr, target, low, mid-1);

            if(left == 0) return mid;
            else return left;
        }
        if(arr[mid] > target) return occ(arr, target, low, mid+1);
        if(arr[mid] < target) return occ(arr, target, mid +1, high);
         return firocc;
        
       
    }
}
