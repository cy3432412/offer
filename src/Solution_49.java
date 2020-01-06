public class Solution_49 {
    public int StrToInt(String str) {
        if(str.length() == 0)   return 0;
        char []chars = str.toCharArray();
        int sign = 1;
        long result = 0;
        if(chars [0] == '-') {
            sign = -1;
        }
        for(int i = 0;i < chars.length;i++){
            if(i==0 && chars[i]=='+'||chars[i]=='-'){
                continue;
            }
            if(chars[i] >= '0' && chars[i] <='9'){
                result = result*10 + chars[i]-'0';
            }
            else{
                return 0;
            }

        }
        if((result *sign > Integer.MAX_VALUE) || (result *sign <Integer.MIN_VALUE)){
            return 0;
        }


        return (int)result *sign;
    }
}
