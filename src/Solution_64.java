import java.util.ArrayList;
//滑动窗口的最大值
public class Solution_64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(num.length == 0 || size == 0 ||num.length < size)    return list;
        for(int i = 0;i <= num.length - size;i++){
            int max = maxNum(num,i,size);
            list.add(max);
        }
        return list;
    }
    private int maxNum(int []num,int begin,int size){
        int max = num[begin];
        for(int i = begin + 1;i < begin + size;i++){
            if(num[i] > max){
                max = num [i];
            }
        }
        return max;
    }
}
