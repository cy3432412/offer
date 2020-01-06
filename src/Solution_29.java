import java.util.ArrayList;
//找出最小的k个数
public class Solution_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input==null || input.length==0 || input.length<k)
            return list;
        /*大根堆*/
        int heap[] = new int[k];
        for (int i = 0; i < k; i++) {
            heap[i]=input[i];
        }
        BulidHeap(heap,k);
        for (int i = k; i < input.length; i++) {
            if(input[i] < heap[0]){
                heap[0] = input[i];
                AdjustHeap(heap,0,k);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(heap[i]);
        }
        /*
        /*冒泡法

        int min = 0;
        for (int i = 0; i < k; i++) {
            for (int j = input.length-1; j > i; j--) {
                if(input[j]<input[j-1]){
                    int temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
            list.add(input[i]);
        }*/
        return list;
    }
    public void BulidHeap(int []heap,int size){
        for (int i = size / 2 - 1; i >= 0;i--) {
            AdjustHeap(heap,i,size);
        }
    }
    public void AdjustHeap(int []heap,int i,int size){
        int lchild = 2 * i + 1;
        int rchild = 2 * i + 2;
        int max = i;
        if(lchild < size && heap[lchild] > heap[max]){
            max = lchild;
        }
        if(rchild < size && heap[rchild] > heap[max]){
            max = rchild;
        }
        if(max != i){
            swap(heap,i,max);
            AdjustHeap(heap, max, size);
        }

    }
    public void swap(int []a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
