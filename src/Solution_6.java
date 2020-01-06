/*旋转数组的最小值*/

public class Solution_6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int i;
        for (i = 0; i < array.length; i++) {
            if(array[i]>array[i+1]){
                break;
            }
        }
        return array[i+1];
    }
}
