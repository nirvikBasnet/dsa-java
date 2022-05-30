package leetcode;

public class remove_duplicate_from_sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        int n = arr.length;

        removeDuplicate(arr, n);
    }

    public static int removeDuplicate(int[] arr, int n){

        if (n == 0 || n == 1)
        return n;
        int j = 1;
        
    for (int i = 0; i < n-1; i++) {

        if(arr[i] != arr[i+1]){
            arr[j] = arr[i+1];
            j++;
        }
        
    }
    
    System.out.println(j);
  
    return j;

       
    }
    
}
