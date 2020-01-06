import java.util.ArrayList;

/*逆序打印链表*/
public class Solution_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>reverseList = new ArrayList<Integer>();
        ListNode pre = null;
        ListNode next = null;
        while(listNode!=null){
            next=listNode.next;
            listNode.next=pre;
            pre=listNode;
            listNode=next;
        }
        while(pre!=null){
            reverseList.add(pre.val);
            pre=pre.next;
        }

        return reverseList;
    }
}
