/*调整数组顺序*/
public class Solution_13 {
    public void reOrderArray(int [] array) {
        /*
        //方法一 创建俩数组在合并
        int  odd[] = new int[array.length];
        int  even[] = new int[array.length];
        int countOdd=0,countEven=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                even[countEven++]=array[i];
            }
            else{
                odd[countOdd++]=array[i];
            }
        }
        int i=0;
        while(i<countOdd){
            array[i]=odd[i];
            i++;
        }
        int j=0;
        while(j<countEven){
            array[i++]=even[j];
            j++;
        }
        */

        //方法二 采用插入排序的思想 发现是偶数往后移
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1)
                for (int j = i; j > 0 ; j--)
                    if (array[j - 1] % 2 == 0){
                        int t = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = t;
                    }
        }


    }
}
