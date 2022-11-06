/* 
 *      判断奇偶数
 *          任意给出一个数字，请用程序实现判断该数是奇数还是偶数，并在控制台输出
 */

import java.util.Scanner;

public class IfTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }

        sc.close();
    }
}
