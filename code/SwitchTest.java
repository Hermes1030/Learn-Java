/* 
 *  春夏秋冬
 *  需求：按照输入的月份输出指定的季节
 * 
 *  12、1、2     冬季
 *  3、4、5      春季
 *  6、7、8      夏季
 *  9、10、11    秋季
 * 
 */

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个月份：");
        int month = sc.nextInt();

        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("请输入正确的月份");
        }

    }
}
