import java.util.PriorityQueue;
//数据流中的中位数
public class Solution_63 {
    private static PriorityQueue<Integer> leftHeap = new PriorityQueue<>((x, y) -> y - x);
    private static PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
    private static boolean isOdd = true;
    public static void Insert(Integer num) {
        if(isOdd) {
            rightHeap.add(num);
            leftHeap.add(rightHeap.poll());
        }else {
            leftHeap.add(num);
            rightHeap.add(leftHeap.poll());
        }
        isOdd = !isOdd;
    }
    public static Double GetMedian() {
        if(leftHeap.isEmpty()) return 0.0;
        if(!isOdd)
            return leftHeap.peek() / 1.0;
        else
            return (leftHeap.peek() + rightHeap.peek()) / 2.0;
    }
}
