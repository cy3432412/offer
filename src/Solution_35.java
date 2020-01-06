public class Solution_35 {
    /*寻找数组中的逆序对*/
    /*采用归并的思想*/
    int cnt = 0;
    public int InversePairs(int [] array) {
        if(array.length == 0 || array == null)
            return 0;
        divide(array,0,array.length-1);
        return cnt;
    }
    private void divide(int []array,int start,int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;
        // 递归分治
        divide(array, start, mid);
        divide(array, mid+1, end);

        //合并
        merge(array, start, end);
    }
    private void merge(int []array,int start,int end){
        int []temp = new int [end-start+1];
        int mid = (start + end)/2;
        int i = start, j = mid + 1,k = 1;
        while(i <= mid && j <= end){
            if(array[i] <= array[j]){
                temp[k++] = array[i++];
            }
            else {
                temp[k++] = array[j++];
                cnt = (cnt + mid - i + 1) % 1000000007;
            }
        }
        while(i <= mid){
            temp[k++]=array[i++];
        }
        while (j <= end){
            temp[k++]=array[j++];
        }
        // 覆盖
        for(int m = 0; m < temp.length; m++){
            array[start + m] = temp[m];
        }
    }
}
