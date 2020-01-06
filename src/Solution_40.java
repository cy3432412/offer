import java.util.HashMap;

public class Solution_40 {
    /*找出只出现俩次的俩个数字*/
    //还有一种异或运算
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < array.length;i++){
            if(map.containsKey(array[i])){
                int val = map.get(array[i]);
                map.put(array[i],val+1);
            }
            else
                map.put(array[i],1);
        }
        for(int i = 0; i < array.length;i++){
            int val = map.get(array[i]);
            if(val == 1){
                if(cnt == 0){
                    num1[0] = array[i];
                    cnt++;
                }
                else
                {
                    num2[0] = array[i];
                    break;
                }

            }
        }
    }

}
