public class Solution_51 {
    /*计算B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]*/
    //缺一个A[i]
    public int[] multiply(int[] A) {
        int []B = new  int [A.length];
        int length = A.length;
        B[0] = 1;
        for (int i = 1; i < length; i++) {
            B[i] = B[i-1] * A[i-1];
        }
        int temp = 1;
        for (int i = length - 2; i >= 0 ; i--) {
            temp = temp * A[i+1];
            B[i] = B[i] *temp;
        }
        return B;
    }
}
