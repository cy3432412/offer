public class Solution_39 {
    /*判断是否为平衡二叉树*/
    /*public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)       return true;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);

        if (Math.abs(left- right) > 1) return false;

        return (IsBalanced_Solution(root.left) && IsBalanced_Solution(root.left));

    }
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
    */
    public boolean IsBalanced_Solution(TreeNode root) {
        // -1为不平衡标志
        //可以避免重复递归操作
        return TreeDepth(root)!=-1;
    }
    private int TreeDepth(TreeNode root) {
        if (root == null)       return 0;
        int left = TreeDepth(root.left);
        if(left == -1)      return -1;
        int right = TreeDepth(root.right);
        if (right == -1)    return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left,right)+1;
    }
}
