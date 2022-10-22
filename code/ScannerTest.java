/* 
 * 三个和尚进阶
 * 从键盘输入三个和尚的升高
 * 通过三元运算符比较
 * 输出最高的和尚升高
 */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
    Scanner info = new Scanner(System.in);
    
    System.out.print("请输入第一个和尚的身高：");
    int height1 = info.nextInt();
    System.out.print("请输入第二个和尚的升高：");
    int height2 = info.nextInt();
    System.out.print("请输入第三个和尚的升高：");
    int height3 = info.nextInt();
    

    int Switch = height1 > height2 ? height1 : height2;
    int maxHeight = Switch > height3 ? Switch : height3;

    System.out.printf("三个和尚中最高的是：%d",maxHeight);

    info.close();
    
    }
}
