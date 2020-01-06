/*复杂链表的复制*/
public class Solution_25 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        RandomListNode curNode = pHead;

        //复制一个节点并插入其后
        while(curNode != null){
            RandomListNode newNode = new RandomListNode(curNode.label);
            newNode.next = curNode.next;
            curNode.next = newNode;
            curNode = newNode.next;
        }

        //遍历结点使其兄弟信息复制到新结点中
        curNode = pHead;
        while(curNode != null){
            if(curNode.random != null){
                curNode.next.random = curNode.random.next;
            }
            curNode = curNode.next.next;
        }

        curNode = pHead;
        //将新建结点拆分出来形成新链表
        RandomListNode cHead = pHead.next;
        RandomListNode newNode = cHead;
        while(curNode!= null){
            curNode.next = curNode.next.next;
            if(newNode.next != null){
                newNode.next = newNode.next.next;
            }
            newNode = newNode.next;
            curNode = curNode.next;

        }
        return cHead;


    }
}
