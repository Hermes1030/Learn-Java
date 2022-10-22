import java.util.Scanner;

// 字符串反转

//      需求：
//          定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//      例如，键盘录入abc，输出结果cba

//      思路：
//          1.键盘录入一个字符串，用Scanner实现
//          2.定义一个方法，实现字符串反转。返回值类型String，参数String s
//          3.在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
//          4.调用方法，用一个变量接受结果
//          5.输出结果

public class StringTest05 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("请输入一个字符串：");
            String charArr = input.nextLine();
            // String getChar = reBack(charArr);
            String getChar = reBack(charArr);
            System.out.println("转换后的字符串："+getChar);
        }

    }
    public static String reBack(String charArr){
        String charStack = "";
        for(int i=0;i<charArr.length();i++){
            // System.out.println(charArr.charAt(len - i -1)); 
            charStack += charArr.charAt(charArr.length() - i -1);
        }
        return charStack;
    }
}
/* 
 * 
 *  代码改进：
 *           遍历方法
 *           for(int i=charArr.length-1;i>=0;i--){
 *               charStack += charArr.charAt(i)
 *           }
 */ 