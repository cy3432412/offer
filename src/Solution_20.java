//定义一个栈结构求栈中最小值
import java.util.Stack;
public class Solution_20 {
    Stack <Integer> stack1 = new Stack<>();
    Stack <Integer> stack2 = new Stack<>();//辅助栈保证最小在top
    public void push(int node) {
        stack1.push(node);
        if(stack2.empty()){
            stack2.push(node);
        }
        if(stack2.peek() >= node){
            stack2.push(node);
        }
    }

    public void pop() {
        if(stack1.peek() == stack2.peek()){
            stack2.pop();
        }
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
