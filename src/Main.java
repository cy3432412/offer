import java.util.*;
public class Main {
    //摘气球

    /*public static void main(String[] args) {
       
    }
    */
    ArrayList<Integer> list = new ArrayList<>();

    public void solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        int maxSum = 0;
        while (!list.isEmpty()) {
            maxSum += judge(list);
        }
        System.out.println(maxSum);
    }


    private int judge(ArrayList<Integer> list){
        if(list.size() == 0)  return 0;
        int index = 0;
        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            if(i == 0){
                if(list.size() == 1)
                    sum = list.get(i);
                sum = list.get(i) * list.get(i+1);
            }
            if(i == list.size()-1 && list.size() > 1){
                sum = list.get(i) * list.get(i-1);
            }
            if(sum != 0)
                sum = list.get(i) * list.get(i-1) *list.get(i+1);
            if(sum > max){
                max = sum;
                index = i;
            }
        }
        list.remove(index);
        return max;
    }
}
/*
    //对unix文件路径精简
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []path = in.nextLine().split("/");
        if(path[1].equals(".."){
            System.out.println("/");
        }
        System.out.println("/"+ path[1]);
    }
*/

    /*
    //求1-n的阶乘之和
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long []result = new long[num + 1];
        result[1] = 1;
        long sum = 0;
        for (int i = 2; i <= num; i++) {
            result[i] = i* result[i-1];
        }
        for (int i = 1; i <= num; i++) {
            sum += result[i];
        }
        in.close();
        System.out.println(sum);
    }
    */


