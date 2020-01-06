import java.util.HashMap;

/*第一个只出现一次的字符位置*/
public class Solution_34 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map= new HashMap<>();
        if(str == null) return -1;
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            int value = map.get(str.charAt(i));
            if(value == 1){
                return i;
            }
        }

        return -1;
    }
}
