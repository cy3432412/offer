import java.util.ArrayList;
//求和为sum的连续正整数序列
public class Solution_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //滑动窗口算法
        int curLow = 1,curHigh = 2;
        while (curLow < curHigh){
            int tempSum = (curLow + curHigh)*(curHigh - curLow + 1) / 2;
            if(tempSum == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = curLow; i <= curHigh; i++) {
                    list.add(i);
                }
                result.add(list);
                curLow++;
            }
            else if(tempSum < sum){
                curHigh++;
            }
            else
                curLow++;
        }
        return result;
    }
}
