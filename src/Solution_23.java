//是否为二叉搜索树的后序遍历
public class Solution_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 1)
            return true;
        if(sequence.length == 0)
            return false;
        return judge(sequence,0,sequence.length-1);
    }
    public boolean judge(int [] sequence,int low ,int high){
        if(low >= high){
            return true;
        }
        int i = low;
        while(sequence[i] < sequence[high]){
            i++;
        }
        for(int j = i;j < high;j++){
            if(sequence[j] < sequence[high]){
                return false;
            }
        }
        return judge(sequence,low,i-1) && judge(sequence, i, high-1);
    }
}
