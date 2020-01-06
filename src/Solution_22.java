//层序遍历二叉树
import java.util.ArrayList;

public class Solution_22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList <Integer> array = new ArrayList<>();
        ArrayList <TreeNode> queue = new ArrayList<>();

        if(root == null)
            return array;
        queue.add(root);
        while(queue.size()!=0){
            TreeNode temp = queue.remove(0);
            array.add(temp.val);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return array;
    }
}
