import java.util.HashMap;

public class Solution_36 {
    /*输入俩链表找出他们的第一个公共结点*/
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        while(cur1 != null){
            map.put(cur1,cur1.val);
            cur1 = cur1.next;
        }
        while(cur2 != null){
            if(map.containsKey(cur2)){
                return cur2;
            }
            cur2 = cur2.next;
        }
        return null;
    }
}
