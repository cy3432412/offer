/*约瑟夫环*/
import java.util.ArrayList;
public class Solution_46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0 || m <= 0)    return -1;
        if(n == 1)  return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        //0 1 2 3 4
        //0 1 3 4
        //1 3 4
        //1 3
        //3

        //记录最初要剔除的序号
        int index = (m-1) % list.size();
        while(list.size() > 1){
            list.remove(index - 1);
            index = (index+m-1) % list.size();
        }
        return list.get(0);
    }
}
