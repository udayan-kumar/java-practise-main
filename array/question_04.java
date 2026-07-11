// two sum;;

package array;

public class question_04 {
    public static void main(String[] args) {
        int[] arr = {1,23,43,56,78};
        int target = 99;

        
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("two sum exist");
                    break;
                }
            }
        }

    }
}
