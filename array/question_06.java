package array;

public class question_06 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,5,6};

       int index = 0;
       for(int i = 1;i<arr.length;i++){
        if(arr[i]!=arr[index]){
            index++;
            arr[index] = arr[i];
        }
       }

       for(int ele : arr){
        System.out.print(ele + " ");
       }
       
       
    }

   
}
