package leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 6;

        sumOfIndex(arr, target);


    }

    public static int[] sumOfIndex(int[] arr, int target){

        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            if(map.containsKey(arr[i])){

                result[0] = i;
                result[1] = map.get(arr[i]);


            }else{
                map.put(target-arr[i], i);
            }
        }

        System.out.println(Arrays.toString(result));

        return result;

    }
    
}
