
// 拼接字符串：
// 需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出。例如，数组int[] arr={1, 2, 3};,执行方法后的输出结果为：[1, 2, 3]
// 思路：
// 1. 定义一个int类型的数组，用静态初始化完成数组元素的初始化
// 2. 定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。返回值类型String，参数列表int[] arr
// 3. 在方法中遍历数组，按照要求进行拼接
// 4. 调用方法，用一个变量接受结果
// 5. 输出结果

public class StringTest04 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        String getArrtoString;
        getArrtoString = getToprint(arr);
        System.out.println(getArrtoString);
    }

    public static String getToprint(int[] arr) {
        String charC = "";
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (i == 0) {
                charC = "[" + elem + ", ";
            } else if (i == arr.length - 1) {
                charC += elem + "]";
            } else {
                charC += elem + ", ";
            }
        }
        return charC;
    }
}
