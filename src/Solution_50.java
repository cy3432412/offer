public class Solution_50 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int []hash = new int [length];
        for(int i = 0;i < length;i++){
            if(numbers[i] >= 0 && numbers[i] < length){
                hash[numbers[i]]++;
            }
            else
                return false;
        }
        duplication[0] = -1;
        for(int i = 0;i <length;i++){
            if(hash[i] > 1){
                duplication[0] = i;
                return true;
            }
        }

        return false;
    }
}
