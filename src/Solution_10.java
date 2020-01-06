/*矩形覆盖*/
//斐波那契数列
public class Solution_10 {
    public int RectCover(int target) {
        int pre=1,next=2;
        int result=0;
        if(target < 1)
            return 0;
        if(target == 1 || target == 2)
            return target;
        for (int i = 3; i <= target; i++) {
            result = pre+next;
            pre = next;
            next = result;
        }

        return result;
    }
}
