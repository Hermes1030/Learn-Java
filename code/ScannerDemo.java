/* 
 * 数据输入
 *  1. 导入包
 *  2. 创建对象
 *  3. 接收数据
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        
        Scanner info = new Scanner(System.in);

        int info_receive = info.nextInt();
    
        System.out.println(info_receive);

        info.close();
    }    
}
