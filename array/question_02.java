// reverse the array

package array;

public class question_02 {
    public static void main(String[] args) {
         int[] arr = {1,5,2,7,11,8,3,9,13};
         int i = 0;
         int j = arr.length-1;

         while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }

         for(int ele : arr){
            System.out.print(ele + " ");
         }
    }
}
