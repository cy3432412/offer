public class Solution_56 {
    //有序链表删除重复节点
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null)     return pHead;
        ListNode newHead = new ListNode(-1);
        newHead.next = pHead;
        ListNode pre = newHead;
        ListNode cur = pHead;

        while(cur.next != null && cur != null){
            if(cur.val == cur.next.val) {
                while (cur.val == cur.next.val && cur.next != null) {
                    cur = cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }
            else{
                pre = cur;
                cur = cur.next;
            }


        }




        return newHead.next;
    }
}
