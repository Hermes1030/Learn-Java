import java.util.Scanner;

/* 
 * 统计字符次数
 *          需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
 * 
 *          思路：
 *              1.键盘录入一个字符串，用Scanner实现
                2.要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
                3.遍历字符串，得到每一个字符
                4.判断该字符属于哪种类型，然后对应类型的统计变量+1
	                假如ch是一个字符，我呀判断它属于大写字母，小写字母，还是数字，直接判断字符是否在对应的范围即可
	                - 大写字母：ch>='A' && ch<='Z'
	                - 小写字母：ch>='a' && ch<='z'
	                - 数字：ch>='0' && ch<='9'
                5.输出三种类型的字符个数
 */

public class StringTest03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String input_ed = input.nextLine();

        int n = 0; // 大学字母
        int g = 0; // 小写字母
        int t = 0; // 数字

        for (int i = 0; i < input_ed.length(); i++) {
            char ch = input_ed.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                n++;
            } else if (ch >= 'a' && ch <= 'z') {
                g++;
            } else if (ch >= '0' && ch <= '9') {
                t++;
            }
        }
        System.out.println("大写字母：" + n + "小写字母：" + g + "数字：" + t);
        
        input.close();
    }
}
