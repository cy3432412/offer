/*给前序中序重建二叉树*/
public class Solution_4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstruct(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstruct(int []pre,int preStart,int preEnd,int []in,int inStart,int inEnd){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);

        for (int i = inStart; i <= inEnd; i++) {
            //在中序遍历找到子树的根
            if(in[i]==pre[preStart]) {
                root.left = reConstruct(pre, preStart + 1, i - inStart + preStart, in, inStart, i - 1);
                root.right = reConstruct(pre, i - inStart + preStart + 1, preEnd, in, i + 1, inEnd);
                /*
                root.left=reConstruct(pre,preStart+1,i,in,inStart,i-1);
                root.right=reConstruct(pre,preEnd-i,preEnd,in,i+1,inEnd);
                */
                break;
            }
        }
        return root;
    }
}
