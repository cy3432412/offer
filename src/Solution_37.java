public class Solution_37 {
    /*查找k在数组中的数目*/
    public int GetNumberOfK(int [] array , int k) {
        //二分搜索
        int cnt = 0;
        if(array.length == 0)   return 0;
        int start = 0,end = array.length-1;
        int mid = 0;
        while (start <= end){
            mid = (start + end)/2;
            if(k < array[mid]){
                end = mid - 1;
            }
            else if(k > array[mid]){
                start = mid + 1;
            }
            else {
                break;
            }
        }
        for (int i = mid; i <= end; i++) {
            if(array[i] == k){
                cnt++;
            }
            else
              break;
        }
        for (int i = mid - 1; i >= start ; i--) {
            if(array[i] == k){
                cnt++;
            }
            else
                break;
        }
        return cnt;
    }
}
