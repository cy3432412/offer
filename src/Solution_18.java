/*操作给定的二叉树，将其变换为源二叉树的镜像。*/

public class Solution_18 {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            if(root.left!=null){
                Mirror(root.left);
            }
            if(root.right!=null){
                Mirror(root.right);
            }
        }
    }
}
