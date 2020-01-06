import java.util.ArrayList;
import java.util.Stack;

//之字形打印二叉树
public class Solution_59 {
    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();
    ArrayList<ArrayList<Integer> > result = new ArrayList<>();

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if(pRoot == null)    return result;
        int layer = 1;
        stack1.push(pRoot);
        while(!stack1.empty() || !stack2.empty()){

            if(layer % 2 == 1){
                ArrayList<Integer> list = new ArrayList<>();
                while(!stack1.empty()){
                    TreeNode temp = stack1.pop();
                    if(temp != null){
                        list.add(temp.val);
                        stack2.push(temp.left);
                        stack2.push(temp.right);
                    }
                }
                if(!list.isEmpty()){
                    layer++;
                    result.add(list);
                }

            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                while(!stack2.empty()){
                    TreeNode temp = stack2.pop();
                    if(temp != null){
                        list.add(temp.val);
                        stack1.push(temp.right);
                        stack1.push(temp.left);
                    }
                }
                if(!list.isEmpty()){
                    layer++;
                    result.add(list);
                }
            }
        }
        return result;
    }

}
