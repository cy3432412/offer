/*数字中1的个数*/
public class Solution_31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += CountOf1(i);
        }
        return count;
    }


    private int CountOf1(int num){
        int count = 0;
        while(num != 0){
            if(num % 10 == 1){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
