import java.util.HashMap;
import java.util.Map;

public class roman_to_integer {

    public static void main(String[] args) {
        String x = "IV";
        String x1 = "MMCL";

        romanToInt(x);
        romanToInt(x1);
    }
    
    public static int romanToInt(String x){

        Map<Character,Integer> map =new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i =0; i<x.length();i++){
            if(i>0 && map.get(x.charAt(i))>map.get(x.charAt(i-1))){

                result += map.get(x.charAt(i)) - 2 * map.get(x.charAt(i-1)); //IV = 5-1 = 4, as we already have 1 in result we do 2*

            }else{
                
                result += map.get(x.charAt(i));
            }
        }

        System.out.println(result);

        return result;
    }
}
