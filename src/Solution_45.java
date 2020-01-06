import java.util.Arrays;

//判断五张牌是不是顺子
public class Solution_45 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5)     return false;
        int zero = 0; //癞子数目
        int sumOfdifference = 0;//除了0以外的数字之间的差的牌数
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] == 0){
                zero ++;
                continue;
            }
            if(numbers[i] == numbers[i+1])  return false;
            sumOfdifference += numbers[i+1] - numbers[i] - 1;
        }
        return sumOfdifference <= zero;
    }
}
