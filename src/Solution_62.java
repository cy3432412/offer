import java.util.ArrayList;
//二叉搜索树第k小的结点
public class Solution_62 {
    ArrayList<TreeNode> list = new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null)    return null;
        inOrder(pRoot);
        if(k > list.size() || k < 1)    return null;
        else    return list.get(k-1);
    }
    //中序遍历
    void inOrder(TreeNode root){
        if(root == null)    return;
        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }
}
