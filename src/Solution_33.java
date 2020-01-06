/*寻找丑数*/
public class Solution_33 {
    public int GetUglyNumber_Solution(int index) {
        //只包含2,3,5的丑数

        if (index <= 0) {
            return 0;
        }
        int[] UglyNumber = new int[index + 1];
        UglyNumber[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= index; i++) {
            int temp = Math.min(UglyNumber[p2] * 2, Math.min(UglyNumber[p3] * 3, UglyNumber[p5] * 5));
            UglyNumber[i] = temp;
            if (temp == UglyNumber[p2] * 2) {
                p2++;
            }
            if (temp == UglyNumber[p3] * 3) {
                p3++;
            }
            if (temp == UglyNumber[p5] * 5){
                p5++;
            }

        }
        return UglyNumber[index];

    }
}
