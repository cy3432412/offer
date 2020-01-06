public class Solution_58 {
    //判断二叉树是否为镜像二叉树
    //三种方法
    //递归，bfs，dfs
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null)        return true;
        return judge(pRoot.left,pRoot.right);
    }
    private boolean judge(TreeNode left,TreeNode right){
        if(left == null){
            if(right == null){
                return true;
            }
            else
                return false;
        }
        if(right == null)    return false;
        if(left.val != right.val)    return false;
        return judge(left.left,right.right) && judge(left.right,right.left);
    }
}
