import java.util.Scanner;

/* 
 * 
 *      字符串反转
 *              需求：
 *                  定义一个方法，实现字符串的反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
 *                  例如：键盘录入abc，输出结果cba
 * 
 *              思路：
 *                  1. 键盘录入一个字符串，用Scanner实现
 *                  2. 定义一个方法，实现字符串反转。返回值类型String，参数String s
 *                  3. 在方法中StingBuilder实现字符串的反转，并把结果转成String返回
 *                  4. 调用方法，用一个变量接收结果
 *                  5. 输出结果
 *       
 */

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s0 = reverse(s);
        
        System.out.println(s0);

        in.close();
    }

    public static String reverse(String s) {
        
        StringBuilder sb = new StringBuilder(s);    // 在定义StringBuilder时 直接将s传入构建方法

        // 这里其实不用遍历传进来的字符串

        // for (int i = 0; i < s.length(); i++) {
        //     sb.append(s.charAt(i));
        // }
        // sb.reverse();

        sb.reverse();
        return sb.toString();
        // return new StringBuilder(s).reverse().toString()
    }
}
