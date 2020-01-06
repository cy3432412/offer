/*最大子序列的和*/
public class Solution_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = -999990;
        int []ans = new int[array.length];
        //f[n] = max(f[n-1]+a[n],a[n])
        ans[0]=array[0];
        for(int i = 1;i < array.length;i++){
            ans[i]=Math.max(ans[i-1]+array[i],array[i]);
            sum = Math.max(ans[i],sum);
        }
        return sum;
    }
}
