import java.util.Stack;
public class Solution_66 {
    private static int []dx = {0,1,0,-1};
    private static int []dy = {1,0,-1,0};
    private int count = 0;
    public int movingCount(int threshold, int rows, int cols)
    {
        if(rows <= 0 || cols <= 0 || threshold <= 0)    return count;
        boolean vis[]= new boolean [rows*cols];
        Stack <Integer> s = new Stack<>();
        s.push(0);
        vis[0] = true;
        while(!s.empty()){
            int location = s.pop();
            int x = location % cols;
            int y = location / cols;
            count ++;
            for(int i = 0 ;i < 4;i++){
                int xn = x + dx[i];
                int yn = y + dy[i];
                if(xn >= 0 && yn >=0 && xn < cols && yn < rows
                        && bitSum(xn,yn) <= threshold && !vis[xn + yn*cols]){
                    s.push(xn + yn*cols);
                    vis[xn + yn*cols] = true;
                }
            }
        }
        return count;
    }

    private int bitSum(int i,int j){
        int sum = 0;
        while(i > 0){
            sum += i%10;
            i /= 10;
        }
        while(j > 0){
            sum += j%10;
            j /= 10;
        }
        return sum;
    }
}

