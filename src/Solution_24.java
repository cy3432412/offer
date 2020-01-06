/*二叉树满足条件的路径*/
import java.util.ArrayList;
public class Solution_24 {
    ArrayList <ArrayList<Integer>> allList = new ArrayList<>();//存储所有路径
    ArrayList <Integer> list = new ArrayList<>();//存储满足条件的路径
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return allList;
        list.add(root.val);
        target -= root.val;
        //搜索结束条件
        if(target == 0 && root.right == null && root.left == null){
            allList.add(new ArrayList<>(list));
        }
        //递归搜索
        FindPath(root.left, target);
        FindPath(root.right, target);
        //回溯
        list.remove(list.size()-1);
        return allList;
    }
}
