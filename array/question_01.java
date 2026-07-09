// find second largest element in the array;;

package array;

public class question_01 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,11,8,3,9,13};
       int max = 0;
       int smax = 0;

       for(int i = 0; i<max ; i++){
        if(arr[i] > max)
        max = arr[i];
       }

       for(int i = 0; i<arr.length;i++){
        if(arr[i] > smax && arr[i] !=max)
       smax  = arr[i];
       }
        System.out.println(smax);

    }
}
