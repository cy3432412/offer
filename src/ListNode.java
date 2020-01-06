public class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
    void print(ListNode head){
        ListNode current = head;
        while (current!= null) { // 最后一个节点的为空
            System.out.print(current.val + "-->");
            current = current.next; // 当前节点往后移动一个位置
        }

    }
}
