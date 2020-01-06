/*斐波那契数列*/
public class Solution_7 {
    static int f[]=new int[40];
    public int Fibonacci(int n) {

        /*递归
        if(n < 1)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
        */
        /*记忆化搜索*/
        if(n==1 ||n==2){
            return 1;
        }
        if(f[n]!=0){
            return f[n];
        }
        else{
            f[n]=Fibonacci(n-1)+Fibonacci(n-2);
            return f[n];
        }



    }
}
