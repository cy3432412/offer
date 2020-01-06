/*给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。*/
public class Solution_12 {
    public double Power(double base, int exponent) {
        //快速幂
        /**
         * 将exponent分成二进制表示
         * 则base的exponent次方可以拆成几个base的不同次方相乘
         * 例如 2^5=2^1 * 2^4
         */
        double result=1.0;
        if(exponent < 0){
            exponent = Math.abs(exponent);
            base = 1/base;
        }
        if(exponent == 0){
            return 1;
        }
        while(exponent != 0){
            if((exponent & 1) == 1){
                result *= base;
            }
            base *= base;
            exponent >>= 1;
            //System.out.println(exponent);
        }
        return result;
    }
}
