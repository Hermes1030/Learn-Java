/* 
 * �������н���
 * �Ӽ��������������е�����
 * ͨ����Ԫ������Ƚ�
 * �����ߵĺ�������
 */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
    Scanner info = new Scanner(System.in);
    
    System.out.print("�������һ�����е���ߣ�");
    int height1 = info.nextInt();
    System.out.print("������ڶ������е����ߣ�");
    int height2 = info.nextInt();
    System.out.print("��������������е����ߣ�");
    int height3 = info.nextInt();
    

    int Switch = height1 > height2 ? height1 : height2;
    int maxHeight = Switch > height3 ? Switch : height3;

    System.out.printf("������������ߵ��ǣ�%d",maxHeight);

    info.close();
    
    }
}
