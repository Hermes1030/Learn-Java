import java.util.Scanner;

/* 
 * ͳ���ַ�����
 *          ���󣺼���¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ����������������ַ���
 * 
 *          ˼·��
 *              1.����¼��һ���ַ�������Scannerʵ��
                2.Ҫͳ���������͵��ַ��������趨������ͳ�Ʊ�������ʼֵ��Ϊ0
                3.�����ַ������õ�ÿһ���ַ�
                4.�жϸ��ַ������������ͣ�Ȼ���Ӧ���͵�ͳ�Ʊ���+1
	                ����ch��һ���ַ�����ѽ�ж������ڴ�д��ĸ��Сд��ĸ���������֣�ֱ���ж��ַ��Ƿ��ڶ�Ӧ�ķ�Χ����
	                - ��д��ĸ��ch>='A' && ch<='Z'
	                - Сд��ĸ��ch>='a' && ch<='z'
	                - ���֣�ch>='0' && ch<='9'
                5.����������͵��ַ�����
 */

public class StringTest03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String input_ed = input.nextLine();

        int n = 0; // ��ѧ��ĸ
        int g = 0; // Сд��ĸ
        int t = 0; // ����

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
        System.out.println("��д��ĸ��" + n + "Сд��ĸ��" + g + "���֣�" + t);
        
        input.close();
    }
}
