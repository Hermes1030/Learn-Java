import java.util.Scanner;

/* 
 * 评委打分
 *         需求：
 *              在编程竞赛中，有6个评委为参赛的选手打分，分数为[0, 100]
 *              选手的最后得分为：去掉一个最高分和一个最低分的4个评委的平均值（取整）
 *         思路：
 *              1. 定义一个数组，用动态初始化完成数组元素的初始化，长度为6
 *              2. 键盘录取评委分数
 *              3. 用循环接受评委操作
 *              4. 定义方法：
 *                  a. 获取最高分
 *                  b. 获取最低分
 *                  c. 获取数组所有元素的和
 *              5. 按照计算规则算取平均分，输出
 * 
 *  */

public class Test10 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int arr[] = new int[6];

        for(int i=0;i<6;i++){
            arr[i] = user_input.nextInt();
        }
        int resolve = (GetSum(arr) - GetMax(arr) -GetLow(arr))/4; 
        System.out.println("该选手的最终得分是："+resolve);
        user_input.close();
    }
    public static int GetMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(max < arr[i+1]){
                max = arr[i+1];
            }
        }
        return max;
    }
    public static int GetLow(int[] arr){
        int low = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(low>arr[i+1]){
                low = arr[i+1];
            }
        }
        return low;
    }
    public static int GetSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
