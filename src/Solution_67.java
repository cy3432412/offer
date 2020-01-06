public class Solution_67 {
    public int cutRope(int target) {
        int n = target;
        // n<=3的情况，m>1必须要分段，例如：3必须分成1、2；1、1、1 ，n=3最大分段乘积是2,
        if(n==2 || n==1)
            return 1;
        if(n==3)
            return 2;
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        int res = 0;
        for(int i = 4;i <= n; i++){
            for(int j = 1;j <= i/2;j++){
                res = Math.max(res,dp[j]*dp[i-j]);
            }
            dp[i] = res;
        }
        return dp[n];
    }
}
