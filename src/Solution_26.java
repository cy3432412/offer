/*二叉树与双向链表*/
import java.util.ArrayList;
public class Solution_26 {
    //先中序遍历，添加进ArrayList
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        inOrderTraversal(pRootOfTree,list);
        //形成双向链表
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }
    public void inOrderTraversal(TreeNode pRootOfTree,ArrayList list){
        if(pRootOfTree == null){
            return;
        }
        inOrderTraversal(pRootOfTree.left, list);
        list.add(pRootOfTree);
        inOrderTraversal(pRootOfTree.right, list);

    }
}
