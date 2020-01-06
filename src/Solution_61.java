import java.util.*;
//序列化和反序列化二叉树
public class Solution_61 {
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        Queue <TreeNode> queue = new LinkedList<>();
        if(root!=null)    queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp!=null){
                sb.append(temp.val + ",");
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
            else{
                sb.append("#"+",");
            }
        }
        if(sb.length()!=0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();

    }
    /*
    0 1 2 3 4 5 6
    */
    TreeNode Deserialize(String str) {
        TreeNode root = null;
        if(str == null || str.length()==0)    return root;
        String []nodes = str.split(",");
        TreeNode []tn  = new TreeNode[nodes.length];
        for(int i = 0;i<tn.length;i++){
            if(!nodes[i].equals("#")){
                tn[i] = new TreeNode(Integer.valueOf(nodes[i]));
            }
        }
        for(int i = 0,j = 1;j<tn.length;i++){
            if(tn[i]!=null){
                tn[i].left = tn[j++];
                tn[i].right = tn[j++];
            }
        }

        return tn[0];

    }
}
