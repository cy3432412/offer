import java.util.ArrayList;

public class Solution_57 {
    ArrayList<TreeLinkNode> list = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)        return null;
        TreeLinkNode root = pNode;
        while(root.next != null){
            root = root.next;
        }
        midTraversal(root);
        int index = list.indexOf(pNode);
        return index == list.size() - 1? null : list.get(index+1);

    }
    private void midTraversal(TreeLinkNode root){
        if(root == null)    return;
        midTraversal(root.left);
        list.add(root);
        midTraversal(root.right);
    }
}
