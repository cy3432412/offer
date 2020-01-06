/*字符串内单词翻转*/
public class Solution_44 {
    public String ReverseSentence(String str) {
        String result = "";
        if(str.trim().equals(""))      return str;
        String []list = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = list.length - 1; i >= 0; i--) {
            stringBuffer.append(list[i]);
            if(i != 0)
                stringBuffer.append(" ");
        }
        result = stringBuffer.toString();
        return result;
    }
}
