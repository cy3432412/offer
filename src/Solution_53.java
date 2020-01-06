public class Solution_53 {
    //判断字符串是否为数值
    //+100 -23 -1E-123 5e2
    public boolean isNumeric(char[] str) {

            boolean sign = false;//正负号
            boolean dot = false;//小数点
            boolean eOrE = false;//e或者E
            for (int i = 0; i < str.length; i++) {
                if(str[i] =='e' || str[i] == 'E'){
                    if(!eOrE)
                        eOrE = true;
                    else
                        return false;
                    if(i == str.length-1){
                        return false;
                    }
                }
                else if(str[i] == '+' || str[i] == '-'){
                    if(!sign){
                        sign = true;
                    }
                    else{
                        if(!eOrE){
                            return false;
                        }
                    }
                    if(!eOrE && i>0)
                        return false;
                    if(i == str.length - 1)
                        return false;
                }
                else if(str[i] == '.'){
                    if(!dot){
                        dot = true;
                    }
                    else
                        return false;
                    if(eOrE)
                        return false;
                    if(i == str.length - 1)
                        return false;
                }
                else if (str[i] < '0' || str[i] > '9')
                    return false;

            }
            return true;

        }

    
}
