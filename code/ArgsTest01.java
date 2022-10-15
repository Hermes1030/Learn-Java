/* 
 * 数组遍历
 *      需求：要求设计一个数组，在一行上面显示。例如：[11, 22, 33, 44, 55]
 *      
 *      思路：因为要求在一行上显示，所以在输出时使用System.out.print()
 *          1. 定义一个数组，用静态数组完成数组元素初始化
 *          2. 定义一个方法，用数组遍历通用格式对数组进行便利
 *          3. 用新的输出语句修改便利操作
 *          4. 调用遍历方法
 * 
 *  
 */


public class ArgsTest01 {
    public static void main(String[] args) {
        System.out.println("Begin");
        int[] arr = {11, 22, 33, 44, 55};
        
        
        printArry(arr);

        System.out.println("Over");
    }
    public static void printArry(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length;i++){
            if( i == arr.length -1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
            
        }
        System.out.print("]\n");
    }
}
