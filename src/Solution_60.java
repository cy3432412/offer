import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
// 二叉树打印多行
public class Solution_60 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Queue<TreeNode> queue =  new LinkedList<>();
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        if(pRoot == null)    return result;
        int end = 1;
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<end;i++){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left != null)    queue.offer(temp.left);
                if(temp.right != null)    queue.offer(temp.right);
            }
            end = queue.size();
            result.add(list);
        }
        return result;

    }
}

