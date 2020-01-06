public class Solution_2 {
    public String replaceSpace(StringBuffer str) {

        String sr = str.toString();

        return sr.replaceAll(" ","%20");
    }
}
