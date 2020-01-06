import java.util.Stack;
//路径搜素
public class Solution_65 {
    private static int []dx = {0,1,0,-1};
    private static int []dy = {1,0,-1,0};
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix == null || matrix.length != rows * cols || str == null || str.length == 0)
            return false;
        boolean []vis =  new boolean[matrix.length];
        for(int i = 0;i < cols;i++){
            for(int j = 0;j < rows;j++){
                if(dfs(matrix,rows,cols,i,j,str,vis))    return true;
            }
        }
        return false;
    }
    private boolean dfs(char []matrix, int rows, int cols,int i,int j,char[] str,boolean []vis){
        if(matrix[i + j*cols] != str[0])    return false;
        Stack <Integer> s = new Stack<>();
        int index = 0; //str指针
        s.push(i+j*cols);
        while(!s.empty()){
            int location = s.peek();
            //访问过，全部复位
            if(vis[location] == true){
                vis[location] = false;
                s.pop();
                if(--index < 0)    return false;
                continue;
            }
            vis[location] = true;
            if(++index == str.length) return true;
            for(int k = 0;k < 4;k++){
                int x = location % cols + dx[k];
                int y = location / cols + dy[k];
                int newLocation = x + y * cols;
                if(x >= 0 && y >= 0 && x < cols && y < rows
                        && !vis[newLocation]&& matrix[newLocation] == str[index]){
                    s.push(newLocation);
                }
            }


        }
        return false;
    }
}
