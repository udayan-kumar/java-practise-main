package array;

public class question_05 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,1,1};
        for(int i = 0;i<arr.length-1;i++){
            boolean issorted = true;
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(issorted == false) break;
            }
            
        }
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }

        int occ = 0;
        int maxocc = 0;
        int ans = -1;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]) occ++;
                else 
                    if(arr[i]!=arr[j]){
                         maxocc = occ;
                        occ=0;
                    }
                     if(occ>maxocc) maxocc = occ;
            }
           
            // ans = arr[i];
           
        }
        System.out.println(maxocc);
    }
}
