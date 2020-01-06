/*栈的压入弹出序列*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution_21 {
    //模拟
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(popA.length == 0 || pushA.length == 0){
            return false;
        }
        Stack <Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            //如果栈不为空，且栈顶元素等于弹出序列
            while(!stack.empty() &&stack.peek() == popA[index]){
                //出栈
                stack.pop();
                //弹出序列向后一位
                index++;
            }
        }

        return stack.empty();
    }
}
