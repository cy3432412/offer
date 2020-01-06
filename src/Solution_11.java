/*整数中1的个数*/
public class Solution_11 {
    public int NumberOf1(int n) {
        int count=0;

        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }

            n = n >>> 1;
            //System.out.println(n);

        }



        return count;
    }
}
