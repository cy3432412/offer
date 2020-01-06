public class Solution_52 {
    //模式匹配
    //仅支持. *，.代表一个字符，*代表前一个字符可以出现任意次数
    //全局匹配
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null && pattern == null){
            return false;
        }
        int indexPattern = 0;
        int indexStr = 0;
        return core(str,indexStr,pattern,indexPattern);
    }
    private boolean core(char[] str,int indexStr,char[] pattern,int indexPattern){
        if(indexStr == str.length && indexPattern == pattern.length)
            return true;
        if(indexStr != str.length && indexPattern == pattern.length)
            return false;
        if(indexPattern + 1 < pattern.length && pattern[indexPattern + 1] == '*'){
            if( (indexStr != str.length && pattern[indexPattern] == str[indexStr]) ||
                    (pattern[indexPattern] == '.' && indexStr != str.length))
            {
                return core(str,indexStr+1,pattern,indexPattern)||
                        core(str,indexStr+1,pattern,indexPattern+2)||
                        core(str,indexStr,pattern,indexPattern+2);
            }
            else{

                return core(str,indexStr,pattern,indexPattern+2);

            }
        }
        if(indexStr != str.length){
            if(pattern[indexPattern] == '.' || pattern[indexPattern] == str[indexStr])
                return core(str,indexStr+1,pattern,indexPattern+1);

        }
        return false;





    }
}
