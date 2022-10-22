import java.lang.ProcessBuilder.Redirect.Type;

/* 
 * 拼接字符串
	需求：
		定义一个方法，把int数组中的数据按照指定的格式拼接称一个字符串返回，调用该方法，并在控制台输出结果。
        例如，数组为int[] arr ={1, 2, 3};执行方法后的输出结果为：[1, 2, 3]
	思路：
		1. 定义一个int类型的数组，用静态初始化完成数组元素的初始化
		2. 定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。返回值类型String，参数列表int[] arr
		3. 在方法中用String Builder按照要求进行拼接，并把结果转成String返回
		4. 调用方法，用一个变量接收结果
		5. 输出结果
 */

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
        String ss = arrayString(arr);
        System.out.println(ss);
        
    }

    public static String arrayString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append("[");
            }

            sb.append(arr[i]);
            
            if(i!= arr.length -1){
                sb.append(", ");
            }

            if (i == arr.length - 1) {
                sb.append("]");
            }
        }

        return sb.toString();
    }

}
