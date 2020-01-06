import java.util.HashMap;

//找出链表中的环的入口
public class Solution_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null)    return null;
        HashMap <ListNode,Integer> map = new HashMap<>();
        while(pHead != null){
            if(map.containsKey(pHead)){
                return pHead;
            }
            else{
                map.put(pHead,1);
                pHead = pHead.next;
            }
        }
        return null;
    }
}
