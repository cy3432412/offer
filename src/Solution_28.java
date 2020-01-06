import java.util.HashMap;
import java.util.Map;


public class Solution_28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0 ;
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i],new Integer(1));
            }
            else{
                Integer val = map.get(array[i]);
                map.put(array[i],val+1);
            }
        }
        for (Integer key:map.keySet()){
            Integer val = map.get(key);
            if(val > array.length/2) {
                result = key;
                break;
            }

        }
        return  result;
    }
}
