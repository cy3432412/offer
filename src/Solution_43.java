public class Solution_43 {
    //字符串循环左移
    public String LeftRotateString(String str,int n) {
        String result = "";
        if(n > str.length())   return result;
        /*char []chars = str.toCharArray();
        char []temp = new char[n];
        for (int i = 0; i < n; i++) {
            temp[i] = chars[i];
        }
        for (int i = n; i < chars.length; i++) {
            chars[i-n] = chars[i];
        }
        // 1 2 3 4 5 6
        // 3 4 5 6 5 6
        // 3 4 5 6 1 2
        // 0 - 2 + 6 = 4
        for (int i = 0; i < n; i++) {
            chars[i-n+chars.length] = temp[i];
        }
        result = String.valueOf(chars);
        */
        String str1 = str.substring(0,n);
        String str2 = str.substring(n);
        result = str2 + str1;
        return result;
    }
}
