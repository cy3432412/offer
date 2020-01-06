/*跳台阶高级版*/
/*F[n]=F[n-1]+...+F[1]
  F[n-1]=F[n-2]+...+F[1]
  =>F[n]=2F[n-1]
 */
public class Solution_9 {
    public int JumpFloorII(int target) {
        //2^(target-1) 左移
        int a=1;
        return a << (target-1);
    }
}
