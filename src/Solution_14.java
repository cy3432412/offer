//输入一个链表，输出该链表中倒数第k个结点。
public class Solution_14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head;
        ListNode q = head;
        int i=0;
        while(p!=null){
            if(i>=k)
                q=q.next;
            p=p.next;
            i++;
        }


        return i < k ? null : q;
    }
}
