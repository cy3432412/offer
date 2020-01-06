import java.util.ArrayList;

public class Solution_42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] + array [i] == sum){
                    if(result.isEmpty()){
                        result.add(array[i]);
                        result.add(array[j]);
                    }
                    else{
                        int temp1 = result.get(0) * result.get(1);
                        int temp2 = array[i] * array[j];
                        if(temp2 < temp1){
                            result.clear();
                            result.add(array[i]);
                            result.add(array[j]);
                        }
                    }
                }
            }
        }
        return result;
    }
}
