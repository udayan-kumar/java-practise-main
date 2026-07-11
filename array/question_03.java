// move all zero in the end

package array;

public class question_03 {
    public static void main(String[] args) {
        int[] arr = {1,5,0,4,2,0,8};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
          if(arr[i] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
           j--;
          }
          i++;
         
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
