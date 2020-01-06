/*顺时针打印矩阵*/
import java.util.ArrayList;
public class Solution_19 {
    //画图考虑边界问题
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> clockwise = new ArrayList<>();
        int row=matrix.length,col=matrix[0].length;
        if(row == 0)
            return clockwise;
        int circle = ((row < col ? row : col) + 1) / 2;
        for (int i = 0; i < circle; i++) {
            for (int j = i; j < col - i; j++) {
                clockwise.add(matrix[i][j]);
            }
            for (int j = i + 1; j < row - i; j++) {
                clockwise.add(matrix[j][col-i-1]);
            }
            for (int j = col - i - 2; j >= i && row - i - 1 != i; j--) {
                clockwise.add(matrix[row-i-1][j]);
            }
            for(int j = row - i - 2; j > i && col - i - 1 != i; j--){
                clockwise.add(matrix[j][i]);
            }

        }

        return clockwise;
    }
}
