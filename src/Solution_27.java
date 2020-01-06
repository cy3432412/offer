import java.util.ArrayList;
import java.util.Collections;

//字符串的全排列
public class Solution_27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if(str == null || str.length() == 0){
            return list;
        }
        char []ch = str.toCharArray();

        PermHelp(ch,0,list);
        Collections.sort(list);
        return list;
    }
    private void PermHelp(char []ch,int k,ArrayList<String> list){
        if(k == ch.length-1){
            String val = String.valueOf(ch);
            if (!list.contains(val))
                list.add(val);
        }
        else{
            for (int i = k; i < ch.length; i++) {
                swap(ch,i,k);
                PermHelp(ch,k+1,list);
                swap(ch,i,k);
            }
        }
    }
    private void swap(char []a,int i,int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
