import java.util.HashMap;
import java.util.ArrayList;
//字符流中第一个不重复字符
public class Solution_54 {
    //Insert one char from stringstream
    HashMap <Character,Integer> map = new HashMap<>();
    ArrayList <Character> list = new ArrayList<>();
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            int val = map.get(ch);
            map.put(ch,++val);
        }
        else{
            map.put(ch,1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char ch:list){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '#';
    }
}