public class Solution_1 {
    public boolean Find(int target, int [][] array) {
        /*遍历ac*/
        /*for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }*/
        /*二分查找*/
        for(int i=0;i<array.length;i++){
            int low=0;
            int high=array[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(target>array[i][mid])
                    low=mid+1;
                else if(target<array[i][mid])
                    high=mid-1;
                else
                    return true;
            }
        }
        return false;

    }
}
