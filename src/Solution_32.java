/*数字拼接使之最小*/
public class Solution_32 {
    public String PrintMinNumber(int [] numbers) {
        String result = "";
        for(int i = 0;i < numbers.length;i++){
            for (int j = i + 1; j < numbers.length; j++) {
                int num1 = Integer.valueOf(numbers[i]+""+numbers[j]);
                int num2 = Integer.valueOf(numbers[j]+""+numbers[i]);
                if(num1 > num2){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            result += String.valueOf(numbers[i]);
        }


        return result;

    }
}
